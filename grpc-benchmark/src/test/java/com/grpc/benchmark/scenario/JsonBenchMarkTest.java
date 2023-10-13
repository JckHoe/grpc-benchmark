package com.grpc.benchmark.scenario;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JsonBenchMarkTest {
    private JsonBenchMark benchMark = new JsonBenchMark();
    private JsonBenchMark.ExecutionPlan plan = new JsonBenchMark.ExecutionPlan();

    @BeforeEach
    void init() {
        plan = new JsonBenchMark.ExecutionPlan();
        plan.setUp();
    }

    @Test
    public void decode() {
        benchMark.decode(plan);
    }

    @Test
    public void encode() {
        benchMark.encode(plan);
    }
}
