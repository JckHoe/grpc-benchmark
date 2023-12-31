package com.grpc.benchmark.scenario;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import com.grpc.benchmark.data.PlaceholderData;
import com.grpc.benchmark.model.ExampleWrapperPayload;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Threads;
import org.openjdk.jmh.annotations.Warmup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

@Threads(8)
@Fork(value = 1, warmups = 2)
@BenchmarkMode(Mode.AverageTime)
@Warmup(iterations = 5, time = 1)
@Measurement(iterations = 5, time = 1)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
public class ProtoWrapperBenchMark {
    private static final Logger logger = LoggerFactory.getLogger(ProtoWrapperBenchMark.class);

    @State(Scope.Benchmark)
    public static class ExecutionPlan {
        ExampleWrapperPayload payload;
        byte[] bytePayload;

        @Setup(Level.Trial)
        public void setUp() throws IOException {
            payload = PlaceholderData.getWrapperPayload();

            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            CodedOutputStream output = CodedOutputStream.newInstance(baos);
            PlaceholderData.getWrapperPayload().writeTo(output);
            output.flush();
            bytePayload = baos.toByteArray();
        }
    }

    @Benchmark
    public ExampleWrapperPayload decode(ExecutionPlan plan) throws InvalidProtocolBufferException {
        return ExampleWrapperPayload.parseFrom(plan.bytePayload);
    }

    @Benchmark
    public byte[] encode(ExecutionPlan plan) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream(plan.bytePayload.length);
        CodedOutputStream output = CodedOutputStream.newInstance(baos, plan.bytePayload.length);
        plan.payload.writeTo(output);
        output.flush();
        return baos.toByteArray();
    }
}
