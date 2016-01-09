package com.seanshubin.sample.web;

import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.Server;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HandlerStub implements Handler {
    @Override
    public void handle(String target, Request baseRequest, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        throw new UnsupportedOperationException("Not implemented!");
    }

    @Override
    public void setServer(Server server) {
        throw new UnsupportedOperationException("Not implemented!");
    }

    @Override
    public Server getServer() {
        throw new UnsupportedOperationException("Not implemented!");
    }

    @Override
    public void destroy() {
        throw new UnsupportedOperationException("Not implemented!");
    }

    @Override
    public void start() throws Exception {
        throw new UnsupportedOperationException("Not implemented!");
    }

    @Override
    public void stop() throws Exception {
        throw new UnsupportedOperationException("Not implemented!");
    }

    @Override
    public boolean isRunning() {
        throw new UnsupportedOperationException("Not implemented!");
    }

    @Override
    public boolean isStarted() {
        throw new UnsupportedOperationException("Not implemented!");
    }

    @Override
    public boolean isStarting() {
        throw new UnsupportedOperationException("Not implemented!");
    }

    @Override
    public boolean isStopping() {
        throw new UnsupportedOperationException("Not implemented!");
    }

    @Override
    public boolean isStopped() {
        throw new UnsupportedOperationException("Not implemented!");
    }

    @Override
    public boolean isFailed() {
        throw new UnsupportedOperationException("Not implemented!");
    }

    @Override
    public void addLifeCycleListener(Listener listener) {
        throw new UnsupportedOperationException("Not implemented!");
    }

    @Override
    public void removeLifeCycleListener(Listener listener) {
        throw new UnsupportedOperationException("Not implemented!");
    }
}
