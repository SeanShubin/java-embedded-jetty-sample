package com.seanshubin.sample.web;

import org.junit.Test;

import java.util.function.Function;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ConfigurationLifecycleTest {
    @Test
    public void configurationLifecycle() {
        //given
        String[] commandLineArguments = new String[]{"configuration lifecycle target"};
        Function<String[], Configuration> configurationParser = new ConfigurationParser();
        RunnableStub serverLifecycle = new RunnableStub();
        ServerLifecycleFactoryStub serverLifecycleFactory = new ServerLifecycleFactoryStub(serverLifecycle);
        ConfigurationLifecycle configurationLifecycle =
                new ConfigurationLifecycle(commandLineArguments, configurationParser, serverLifecycleFactory);

        //when
        configurationLifecycle.run();

        //then
        assertThat(serverLifecycleFactory.invocations.size(), is(1));
        assertThat(serverLifecycleFactory.invocations.get(0).greetingTarget, is("configuration lifecycle target"));
        assertThat(serverLifecycle.invocationCount, is(1));
    }
}
