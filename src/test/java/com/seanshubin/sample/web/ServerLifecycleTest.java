package com.seanshubin.sample.web;

import org.eclipse.jetty.server.Handler;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ServerLifecycleTest {
    @Test
    public void serverLifecycle() {
        //given
        Handler handler = new HandlerStub();
        ServerContractStub server = new ServerContractStub();
        ServerFactoryStub serverFactory = new ServerFactoryStub(server);
        ServerLifecycle serverLifecycle = new ServerLifecycle(serverFactory, handler);

        //when
        serverLifecycle.run();

        //then
        assertThat(server.handler, is(handler));
        assertThat(server.invocations.size(), is(2));
        assertThat(server.invocations.get(0), is("start"));
        assertThat(server.invocations.get(1), is("join"));
    }
}
