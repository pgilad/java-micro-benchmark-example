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
# VM version: JDK 11, OpenJDK 64-Bit Server VM, 11+28
# VM invoker: /Users/pelgi01/.sdkman/candidates/java/11.0.0-open/bin/java
# VM options: <none>
# Warmup: 2 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: org.sample.MyBenchmark.testPatternFind

# Run progress: 0.00% complete, ETA 00:02:20
# Fork: 1 of 1
# Warmup Iteration   1: 611648.514 ops/s
# Warmup Iteration   2: 640699.155 ops/s
Iteration   1: 641308.463 ops/s
Iteration   2: 598891.317 ops/s
Iteration   3: 646788.983 ops/s
Iteration   4: 646483.536 ops/s
Iteration   5: 647474.984 ops/s


Result "org.sample.MyBenchmark.testPatternFind":
  636189.457 ±(99.9%) 80841.439 ops/s [Average]
  (min, avg, max) = (598891.317, 636189.457, 647474.984), stdev = 20994.265
  CI (99.9%): [555348.018, 717030.895] (assumes normal distribution)


# JMH version: 1.21
# VM version: JDK 11, OpenJDK 64-Bit Server VM, 11+28
# VM invoker: /Users/pelgi01/.sdkman/candidates/java/11.0.0-open/bin/java
# VM options: <none>
# Warmup: 2 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: org.sample.MyBenchmark.testPatternMatch

# Run progress: 50.00% complete, ETA 00:01:10
# Fork: 1 of 1
# Warmup Iteration   1: 409683.636 ops/s
# Warmup Iteration   2: 432040.654 ops/s
Iteration   1: 434701.685 ops/s
Iteration   2: 430126.235 ops/s
Iteration   3: 438543.930 ops/s
Iteration   4: 434354.855 ops/s
Iteration   5: 432218.240 ops/s


Result "org.sample.MyBenchmark.testPatternMatch":
  433988.989 ±(99.9%) 12092.142 ops/s [Average]
  (min, avg, max) = (430126.235, 433988.989, 438543.930), stdev = 3140.291
  CI (99.9%): [421896.847, 446081.131] (assumes normal distribution)


# Run complete. Total time: 00:02:21

REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
experiments, perform baseline and negative tests that provide experimental control, make sure
the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
Do not assume the numbers tell you what you want them to tell.

Benchmark                      Mode  Cnt       Score       Error  Units
MyBenchmark.testPatternFind   thrpt    5  636189.457 ± 80841.439  ops/s
MyBenchmark.testPatternMatch  thrpt    5  433988.989 ± 12092.142  ops/s
```

## License

MIT
