package com.seanshubin.sample.web;

import org.eclipse.jetty.server.Handler;

public interface ServerContract {
    void setHandler(Handler handler);

    void start();

    void join();
}
