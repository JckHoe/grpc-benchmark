package com.grpc.benchmark;

import com.grpc.benchmark.scenario.JsonBenchMark;
import com.grpc.benchmark.scenario.JsonObjectBenchMark;
import com.grpc.benchmark.scenario.ProtoBenchMark;
import com.grpc.benchmark.scenario.ProtoWrapperBenchMark;
import org.openjdk.jmh.profile.AsyncProfiler;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) throws Exception {
        Options opt = new OptionsBuilder()
                .include(ProtoBenchMark.class.getSimpleName())
                .include(ProtoWrapperBenchMark.class.getSimpleName())
                .include(JsonBenchMark.class.getSimpleName())
                .include(JsonObjectBenchMark.class.getSimpleName())
                .addProfiler(AsyncProfiler.class, "output=flamegraph;dir=/tmp/")
                .forks(1)
                .build();
        new Runner(opt).run();
    }
}
