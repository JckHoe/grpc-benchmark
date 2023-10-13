# grpc-benchmark

This repo is to benchmark protobuf wrapper and compare it with Json Encode/Decode

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
# Run complete. Total time: 00:02:03

REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
experiments, perform baseline and negative tests that provide experimental control, make sure
the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
Do not assume the numbers tell you what you want them to tell.

Benchmark                 Mode  Cnt  Score   Error  Units
JsonBenchMark.decode      avgt    5  0.544 ± 0.043  us/op
JsonBenchMark.encode      avgt    5  0.380 ± 0.026  us/op
ProtobufBenchMark.decode  avgt    5  0.222 ± 0.006  us/op
ProtobufBenchMark.encode  avgt    5  1.524 ± 0.068  us/op

```

### Result 02
```
# Run complete. Total time: 00:02:03

REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
experiments, perform baseline and negative tests that provide experimental control, make sure
the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
Do not assume the numbers tell you what you want them to tell.

Benchmark                 Mode  Cnt  Score   Error  Units
JsonBenchMark.decode      avgt    5  0.529 ± 0.009  us/op
JsonBenchMark.encode      avgt    5  0.367 ± 0.017  us/op
ProtobufBenchMark.decode  avgt    5  0.221 ± 0.004  us/op
ProtobufBenchMark.encode  avgt    5  1.655 ± 1.354  us/op

```

### Result 03
```
# Run complete. Total time: 00:02:03

REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
experiments, perform baseline and negative tests that provide experimental control, make sure
the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
Do not assume the numbers tell you what you want them to tell.

Benchmark                 Mode  Cnt  Score   Error  Units
JsonBenchMark.decode      avgt    5  0.529 ± 0.014  us/op
JsonBenchMark.encode      avgt    5  0.405 ± 0.154  us/op
ProtobufBenchMark.decode  avgt    5  0.221 ± 0.003  us/op
ProtobufBenchMark.encode  avgt    5  1.526 ± 0.144  us/op

```
