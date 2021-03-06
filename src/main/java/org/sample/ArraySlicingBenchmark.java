package org.sample;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArraySlicingBenchmark {

  @Benchmark
  @Fork(value = 1)
  @Warmup(iterations = 2)
  @Measurement(iterations = 5)
  public void testArraysCopyRange(ArraySlicingBenchmark.MyState state, Blackhole blackhole) {
    MyClass[] newData = Arrays.copyOfRange(state.data, state.zeroIndex, state.limitIndex);
    blackhole.consume(newData);
  }

  @Benchmark
  @Fork(value = 1)
  @Warmup(iterations = 2)
  @Measurement(iterations = 5)
  public void testArrayStreamLimit(ArraySlicingBenchmark.MyState state, Blackhole blackhole) {
    MyClass[] newData = Arrays
      .stream(state.data)
      .limit(state.limitIndex)
      .toArray(MyClass[]::new);

    blackhole.consume(newData);
  }

  @State(Scope.Thread)
  public static class MyState {
    int zeroIndex = 0;
    int limitIndex = 100;

    MyClass[] data = IntStream.generate(() -> 1)
      .limit(200)
      .mapToObj(MyClass::new)
      .toArray(MyClass[]::new);
  }

  public static class MyClass {
    int value = 0;

    MyClass(int value) {
      this.value = value;
    }
  }
}
