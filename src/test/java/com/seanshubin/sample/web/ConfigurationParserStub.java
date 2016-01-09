package com.seanshubin.sample.web;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class ConfigurationParserStub implements Function<String[], Configuration> {
    public final Configuration sampleConfiguration;
    public final List<String[]> invocations = new ArrayList<>();

    public ConfigurationParserStub(Configuration sampleConfiguration) {
        this.sampleConfiguration = sampleConfiguration;
    }

    @Override
    public Configuration apply(String[] args) {
        invocations.add(args);
        return sampleConfiguration;
    }
}
