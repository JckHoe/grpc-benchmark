package com.grpc.benchmark.scenario;

import com.google.protobuf.InvalidProtocolBufferException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class ProtoWrapperBenchMarkTest {
    private ProtoWrapperBenchMark benchMark = new ProtoWrapperBenchMark();
    private ProtoWrapperBenchMark.ExecutionPlan plan = new ProtoWrapperBenchMark.ExecutionPlan();

    @BeforeEach
    void init() throws IOException {
        plan = new ProtoWrapperBenchMark.ExecutionPlan();
        plan.setUp();
    }

    @Test
    public void decode() throws InvalidProtocolBufferException {
        benchMark.decode(plan);
    }

    @Test
    public void encode() throws IOException {
        benchMark.encode(plan);
    }
}
