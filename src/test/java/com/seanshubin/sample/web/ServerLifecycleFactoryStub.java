package com.seanshubin.sample.web;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class ServerLifecycleFactoryStub implements Function<Configuration, Runnable> {
    private final Runnable sampleRunnable;
    public final List<Configuration> invocations = new ArrayList<>();

    public ServerLifecycleFactoryStub(Runnable sampleRunnable) {
        this.sampleRunnable = sampleRunnable;
    }

    @Override
    public Runnable apply(Configuration configuration) {
        invocations.add(configuration);
        return sampleRunnable;
    }
}
