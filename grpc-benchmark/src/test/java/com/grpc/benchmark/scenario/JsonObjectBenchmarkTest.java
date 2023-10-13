package com.grpc.benchmark.scenario;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class JsonObjectBenchmarkTest {
    private JsonObjectBenchMark benchMark = new JsonObjectBenchMark();
    private JsonObjectBenchMark.ExecutionPlan plan = new JsonObjectBenchMark.ExecutionPlan();

    @BeforeEach
    void init() throws IOException {
        plan = new JsonObjectBenchMark.ExecutionPlan();
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
