# grpc-benchmark

This repo is to benchmark Encode & Decode performance between:
* Protobuf Model (without wrapper field types)
* Protobuf Model (with wrapper field types)
* Json (Jackson)
* JsonObject 

## Pre Req
Enable this 
```
sudo sysctl -w kernel.perf_event_paranoid=1
sudo sysctl -w kernel.kptr_restrict=0
```

## Running the Benchmark

1. Build the Jar 
```
mvn clean verify
```

2. Execute the Jar
```
java -Djava.library.path=async-profiler/build -jar grpc-benchmark/target/grpc-benchmark-1.0.0-SNAPSHOT-fat.jar
```

## My Results

### Result 01
```

# Run complete. Total time: 00:04:13

REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
experiments, perform baseline and negative tests that provide experimental control, make sure
the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
Do not assume the numbers tell you what you want them to tell.

NOTE: Current JVM experimentally supports Compiler Blackholes, and they are in use. Please exercise
extra caution when trusting the results, look into the generated code to check the benchmark still
works, and factor in a small probability of new VM bugs. Additionally, while comparisons between
different JVMs are already problematic, the performance difference caused by different Blackhole
modes can be very significant. Please make sure you use the consistent Blackhole mode for comparisons.

Benchmark                           Mode  Cnt  Score   Error  Units
JsonBenchMark.decode                avgt    5  0.623 ± 0.097  us/op
JsonBenchMark.decode:async          avgt         NaN            ---
JsonBenchMark.encode                avgt    5  0.377 ± 0.073  us/op
JsonBenchMark.encode:async          avgt         NaN            ---
JsonObjectBenchMark.decode          avgt    5  0.666 ± 0.303  us/op
JsonObjectBenchMark.decode:async    avgt         NaN            ---
JsonObjectBenchMark.encode          avgt    5  0.437 ± 0.125  us/op
JsonObjectBenchMark.encode:async    avgt         NaN            ---
ProtoBenchMark.decode               avgt    5  0.120 ± 0.026  us/op
ProtoBenchMark.decode:async         avgt         NaN            ---
ProtoBenchMark.encode               avgt    5  0.127 ± 0.025  us/op
ProtoBenchMark.encode:async         avgt         NaN            ---
ProtoWrapperBenchMark.decode        avgt    5  0.237 ± 0.029  us/op
ProtoWrapperBenchMark.decode:async  avgt         NaN            ---
ProtoWrapperBenchMark.encode        avgt    5  0.133 ± 0.021  us/op
ProtoWrapperBenchMark.encode:async  avgt         NaN            ---

```

## Profiling results

### JsonBenchmark Decode
![Diagram](./results/com.grpc.benchmark.scenario.JsonBenchMark.decode-AverageTime/flame-cpu-forward.svg)

