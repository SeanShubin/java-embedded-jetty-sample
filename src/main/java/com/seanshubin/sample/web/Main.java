package com.seanshubin.sample.web;

public class Main {
    public static void main(String[] args) throws Exception {
        new ConfigurationWiring(args).configurationLifecycle.run();
    }
}
