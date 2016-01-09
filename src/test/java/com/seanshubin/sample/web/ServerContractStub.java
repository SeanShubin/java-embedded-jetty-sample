package com.seanshubin.sample.web;

import org.eclipse.jetty.server.Handler;

import java.util.ArrayList;
import java.util.List;

public class ServerContractStub implements ServerContract {
    public Handler handler;
    public List<String> invocations = new ArrayList<>();

    @Override
    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void start() {
        invocations.add("start");
    }

    @Override
    public void join() {
        invocations.add("join");
    }
}
