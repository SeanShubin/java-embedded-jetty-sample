package com.seanshubin.sample.web;

import org.eclipse.jetty.server.Handler;

import java.util.function.Supplier;

public class ApplicationWiring {
    public final Runnable serverLifecycle;

    public ApplicationWiring(Configuration configuration) {
        Handler handler = new GreetingHandler(configuration.greetingTarget);
        Supplier<ServerContract> serverFactory = new DefaultPortServerFactory();
        serverLifecycle = new ServerLifecycle(serverFactory, handler);
    }
}
