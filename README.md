# grpc-benchmark

This repo is to benchmark Encode & Decode performance between:
* Protobuf Model (without wrapper field types)
* Protobuf Model (with wrapper field types)
* Json (Jackson)
* JsonObject 

## Running the Benchmark

1. Build the Jar 
```
mvn clean verify
```

2. Execute the Jar
```
java -jar grpc-benchmark/target/grpc-benchmark-1.0.0-SNAPSHOT-fat.jar
```


## My Results

### Result 01
```
# Run complete. Total time: 00:04:06

REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
experiments, perform baseline and negative tests that provide experimental control, make sure
the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
Do not assume the numbers tell you what you want them to tell.

Benchmark                     Mode  Cnt  Score   Error  Units
JsonBenchMark.decode          avgt    5  0.486 ± 0.015  us/op
JsonBenchMark.encode          avgt    5  0.326 ± 0.026  us/op
JsonObjectBenchMark.decode    avgt    5  0.529 ± 0.002  us/op
JsonObjectBenchMark.encode    avgt    5  0.368 ± 0.014  us/op
ProtoBenchMark.decode         avgt    5  0.118 ± 0.004  us/op
ProtoBenchMark.encode         avgt    5  1.534 ± 0.032  us/op
ProtoWrapperBenchMark.decode  avgt    5  0.198 ± 0.006  us/op
ProtoWrapperBenchMark.encode  avgt    5  1.543 ± 0.040  us/op

```

### Result 02
```
# Run complete. Total time: 00:04:06

REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
experiments, perform baseline and negative tests that provide experimental control, make sure
the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
Do not assume the numbers tell you what you want them to tell.

Benchmark                     Mode  Cnt  Score   Error  Units
JsonBenchMark.decode          avgt    5  0.475 ± 0.020  us/op
JsonBenchMark.encode          avgt    5  0.330 ± 0.010  us/op
JsonObjectBenchMark.decode    avgt    5  0.535 ± 0.013  us/op
JsonObjectBenchMark.encode    avgt    5  0.360 ± 0.011  us/op
ProtoBenchMark.decode         avgt    5  0.116 ± 0.008  us/op
ProtoBenchMark.encode         avgt    5  1.539 ± 0.051  us/op
ProtoWrapperBenchMark.decode  avgt    5  0.200 ± 0.004  us/op
ProtoWrapperBenchMark.encode  avgt    5  1.571 ± 0.061  us/op

```

### Result 03
```
# Run complete. Total time: 00:04:06

REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
experiments, perform baseline and negative tests that provide experimental control, make sure
the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
Do not assume the numbers tell you what you want them to tell.

Benchmark                     Mode  Cnt  Score   Error  Units
JsonBenchMark.decode          avgt    5  0.490 ± 0.027  us/op
JsonBenchMark.encode          avgt    5  0.324 ± 0.006  us/op
JsonObjectBenchMark.decode    avgt    5  0.533 ± 0.010  us/op
JsonObjectBenchMark.encode    avgt    5  0.363 ± 0.024  us/op
ProtoBenchMark.decode         avgt    5  0.098 ± 0.001  us/op
ProtoBenchMark.encode         avgt    5  1.542 ± 0.034  us/op
ProtoWrapperBenchMark.decode  avgt    5  0.202 ± 0.005  us/op
ProtoWrapperBenchMark.encode  avgt    5  1.549 ± 0.112  us/op

```
