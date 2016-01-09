package com.seanshubin.sample.web;

import org.eclipse.jetty.server.Server;

import java.util.function.Supplier;

public class DefaultPortServerFactory implements Supplier<ServerContract> {
    @Override
    public ServerContract get() {
        int defaultPort = 8080;
        Server server = new Server(defaultPort);
        return new ServerDelegate(server);
    }
}
