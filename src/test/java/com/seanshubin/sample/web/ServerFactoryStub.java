package com.seanshubin.sample.web;

import java.util.function.Supplier;

public class ServerFactoryStub implements Supplier<ServerContract> {
    private final ServerContract serverContract;

    public ServerFactoryStub(ServerContract serverContract) {
        this.serverContract = serverContract;
    }

    @Override
    public ServerContract get() {
        return serverContract;
    }
}
