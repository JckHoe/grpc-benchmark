package com.grpc.benchmark.scenario;


import com.grpc.benchmark.data.PlaceholderData;
import com.grpc.benchmark.model.JsonExamplePayload;
import io.vertx.core.json.Json;
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

import java.io.IOException;
import java.util.concurrent.TimeUnit;

@Threads(8)
@Fork(value = 1, warmups = 2)
@BenchmarkMode(Mode.AverageTime)
@Warmup(iterations = 5, time = 1)
@Measurement(iterations = 5, time = 1)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
public class JsonBenchMark {
    private static final Logger logger = LoggerFactory.getLogger(JsonBenchMark.class);

    @State(Scope.Benchmark)
    public static class ExecutionPlan {
        JsonExamplePayload payload;
        String json;

        @Setup(Level.Trial)
        public void setUp() {
            payload = PlaceholderData.getJsonPayload();

            json = Json.encode(payload);
        }
    }

    @Benchmark
    public JsonExamplePayload decode(ExecutionPlan plan){
        return Json.decodeValue(plan.json, JsonExamplePayload.class);
    }

    @Benchmark
    public String encode(ExecutionPlan plan) {
        return Json.encode(plan.payload);
    }
}
