package com.seanshubin.sample.web;

import java.util.function.Function;

public class ConfigurationWiring {
    public final ConfigurationLifecycle configurationLifecycle;

    public ConfigurationWiring(String[] args) {
        ConfigurationParser configurationParser = new ConfigurationParser();
        Function<Configuration, Runnable> serverLifecycleFactory = configuration -> new ApplicationWiring(configuration).serverLifecycle;
        configurationLifecycle = new ConfigurationLifecycle(args, configurationParser, serverLifecycleFactory);
    }
}
