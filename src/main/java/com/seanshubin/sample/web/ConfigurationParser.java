package com.seanshubin.sample.web;

import java.util.function.Function;

public class ConfigurationParser implements Function<String[], Configuration> {
    @Override
    public Configuration apply(String[] args) {
        return new Configuration(args[0]);
    }
}
