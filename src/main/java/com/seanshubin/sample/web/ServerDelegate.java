package com.seanshubin.sample.web;

import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;

public class ServerDelegate implements ServerContract {
    private final Server server;

    public ServerDelegate(Server server) {
        this.server = server;
    }

    @Override
    public void setHandler(Handler handler) {
        server.setHandler(handler);
    }

    @Override
    public void start() {
        try {
            server.start();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    @Override
    public void join() {
        try {
            server.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }
}
