package com.seanshubin.sample.web;

import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class GreetingHandler extends AbstractHandler {
    private final String greetingTarget;

    public GreetingHandler(String greetingTarget) {
        this.greetingTarget = greetingTarget;
    }

    @Override
    public void handle(String target,
                       Request baseRequest,
                       HttpServletRequest request,
                       HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html; charset=utf-8");
        response.setStatus(HttpServletResponse.SC_OK);
        String message = String.format("<h1>Hello, %s!</h1>", greetingTarget);
        response.getWriter().println(message);
        baseRequest.setHandled(true);
    }
}
