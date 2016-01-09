package com.seanshubin.sample.web;

public class RunnableStub implements Runnable {
    public int invocationCount = 0;

    @Override
    public void run() {
        invocationCount++;
    }
}
