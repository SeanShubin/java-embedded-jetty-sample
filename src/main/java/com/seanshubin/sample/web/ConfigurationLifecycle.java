package com.seanshubin.sample.web;

import java.util.function.Function;

public class ConfigurationLifecycle implements Runnable {
    private final String[] commandLineArguments;
    private final Function<String[], Configuration> configurationParser;
    private final Function<Configuration, Runnable> serverLifecycleFactory;

    public ConfigurationLifecycle(String[] commandLineArguments,
                                  Function<String[], Configuration> configurationParser,
                                  Function<Configuration, Runnable> serverLifecycleFactory) {
        this.commandLineArguments = commandLineArguments;
        this.configurationParser = configurationParser;
        this.serverLifecycleFactory = serverLifecycleFactory;
    }

    @Override
    public void run() {
        Configuration configuration = configurationParser.apply(commandLineArguments);
        Runnable serverLifecycle = serverLifecycleFactory.apply(configuration);
        serverLifecycle.run();
    }
}
