# java-micro-benchmark-example
> A Java micro-benchmark example of Pattern find vs. matches using JMH framework

I needed to do micro-benchmarks on Java code and created this starter to help me in the future

## Installation and build

```bash
mvn clean install
```

## Running benchmark

Simply run using `java -jar target/benchmarks.jar`:

```bash
$ java -jar target/benchmarks.jar
# JMH version: 1.21
# VM version: JDK 11.0.1, OpenJDK 64-Bit Server VM, 11.0.1+13
# VM invoker: /Users/pelgi01/.sdkman/candidates/java/11.0.1-open/bin/java
# VM options: <none>
# Warmup: 2 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: org.sample.ArraySlicingBenchmark.testArrayStreamLimit

# Run progress: 0.00% complete, ETA 00:04:40
# Fork: 1 of 1
# Warmup Iteration   1: 1040818.801 ops/s
# Warmup Iteration   2: 1060593.136 ops/s
Iteration   1: 1066894.427 ops/s
Iteration   2: 1066709.854 ops/s
Iteration   3: 1066557.600 ops/s
Iteration   4: 1060663.407 ops/s
Iteration   5: 1069377.671 ops/s


Result "org.sample.ArraySlicingBenchmark.testArrayStreamLimit":
  1066040.592 ±(99.9%) 12402.190 ops/s [Average]
  (min, avg, max) = (1060663.407, 1066040.592, 1069377.671), stdev = 3220.809
  CI (99.9%): [1053638.401, 1078442.782] (assumes normal distribution)


# JMH version: 1.21
# VM version: JDK 11.0.1, OpenJDK 64-Bit Server VM, 11.0.1+13
# VM invoker: /Users/pelgi01/.sdkman/candidates/java/11.0.1-open/bin/java
# VM options: <none>
# Warmup: 2 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: org.sample.ArraySlicingBenchmark.testArraysCopyRange

# Run progress: 25.00% complete, ETA 00:03:31
# Fork: 1 of 1
# Warmup Iteration   1: 26589243.469 ops/s
# Warmup Iteration   2: 28714683.597 ops/s
Iteration   1: 28909172.930 ops/s
Iteration   2: 28884393.950 ops/s
Iteration   3: 28839988.471 ops/s
Iteration   4: 28847179.788 ops/s
Iteration   5: 28696959.476 ops/s


Result "org.sample.ArraySlicingBenchmark.testArraysCopyRange":
  28835538.923 ±(99.9%) 317347.449 ops/s [Average]
  (min, avg, max) = (28696959.476, 28835538.923, 28909172.930), stdev = 82414.125
  CI (99.9%): [28518191.474, 29152886.373] (assumes normal distribution)


# JMH version: 1.21
# VM version: JDK 11.0.1, OpenJDK 64-Bit Server VM, 11.0.1+13
# VM invoker: /Users/pelgi01/.sdkman/candidates/java/11.0.1-open/bin/java
# VM options: <none>
# Warmup: 2 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: org.sample.PatternMatchingBenchmark.testPatternFind

# Run progress: 50.00% complete, ETA 00:02:20
# Fork: 1 of 1
# Warmup Iteration   1: 650279.697 ops/s
# Warmup Iteration   2: 678440.017 ops/s
Iteration   1: 682620.764 ops/s
Iteration   2: 682781.705 ops/s
Iteration   3: 685321.757 ops/s
Iteration   4: 677914.475 ops/s
Iteration   5: 683559.497 ops/s


Result "org.sample.PatternMatchingBenchmark.testPatternFind":
  682439.640 ±(99.9%) 10578.344 ops/s [Average]
  (min, avg, max) = (677914.475, 682439.640, 685321.757), stdev = 2747.162
  CI (99.9%): [671861.295, 693017.984] (assumes normal distribution)


# JMH version: 1.21
# VM version: JDK 11.0.1, OpenJDK 64-Bit Server VM, 11.0.1+13
# VM invoker: /Users/pelgi01/.sdkman/candidates/java/11.0.1-open/bin/java
# VM options: <none>
# Warmup: 2 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: org.sample.PatternMatchingBenchmark.testPatternMatch

# Run progress: 75.00% complete, ETA 00:01:10
# Fork: 1 of 1
# Warmup Iteration   1: 423777.701 ops/s
# Warmup Iteration   2: 450119.729 ops/s
Iteration   1: 447881.891 ops/s
Iteration   2: 450314.890 ops/s
Iteration   3: 388034.179 ops/s
Iteration   4: 405189.766 ops/s
Iteration   5: 411625.322 ops/s


Result "org.sample.PatternMatchingBenchmark.testPatternMatch":
  420609.210 ±(99.9%) 105556.621 ops/s [Average]
  (min, avg, max) = (388034.179, 420609.210, 450314.890), stdev = 27412.719
  CI (99.9%): [315052.589, 526165.831] (assumes normal distribution)


# Run complete. Total time: 00:04:41

REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
experiments, perform baseline and negative tests that provide experimental control, make sure
the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
Do not assume the numbers tell you what you want them to tell.

Benchmark                                    Mode  Cnt         Score        Error  Units
ArraySlicingBenchmark.testArrayStreamLimit  thrpt    5   1066040.592 ±  12402.190  ops/s
ArraySlicingBenchmark.testArraysCopyRange   thrpt    5  28835538.923 ± 317347.449  ops/s
PatternMatchingBenchmark.testPatternFind    thrpt    5    682439.640 ±  10578.344  ops/s
PatternMatchingBenchmark.testPatternMatch   thrpt    5    420609.210 ± 105556.621  ops/s
```

## License

MIT © [Gilad Peleg](https://www.giladpeleg.com)
