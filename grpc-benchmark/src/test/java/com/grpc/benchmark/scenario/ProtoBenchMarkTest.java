package com.grpc.benchmark.scenario;

import com.google.protobuf.InvalidProtocolBufferException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class ProtoBenchMarkTest {
    private ProtoBenchMark benchMark = new ProtoBenchMark();
    private ProtoBenchMark.ExecutionPlan plan = new ProtoBenchMark.ExecutionPlan();

    @BeforeEach
    void init() throws IOException {
        plan = new ProtoBenchMark.ExecutionPlan();
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
