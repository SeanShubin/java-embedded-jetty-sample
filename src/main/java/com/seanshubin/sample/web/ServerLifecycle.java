package com.seanshubin.sample.web;

import org.eclipse.jetty.server.Handler;

import java.util.function.Supplier;

public class ServerLifecycle implements Runnable {
    private final Supplier<ServerContract> serverFactory;
    private final Handler handler;

    public ServerLifecycle(Supplier<ServerContract> serverFactory, Handler handler) {
        this.serverFactory = serverFactory;
        this.handler = handler;
    }

    @Override
    public void run() {
        ServerContract server = serverFactory.get();
        server.setHandler(handler);
        server.start();
        server.join();
    }
}
