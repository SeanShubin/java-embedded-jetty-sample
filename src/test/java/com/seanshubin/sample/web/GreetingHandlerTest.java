package com.seanshubin.sample.web;

import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Request;
import org.junit.Test;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GreetingHandlerTest {
    @Test
    public void renderGreeting() throws IOException, ServletException {
        //given
        Handler greetingHandler = new GreetingHandler("greeting target");
        String target = null;
        Request baseRequest = new Request(null, null);
        HttpServletRequest request = null;
        HttpServletResponse response = new HttpServletResponseStub();

        //when
        greetingHandler.handle(target, baseRequest, request, response);

        //then
        assertThat(response.getContentType(), is("text/html; charset=utf-8"));
        assertThat(response.getStatus(), is(200));
        assertThat(baseRequest.isHandled(), is(true));
    }
}
