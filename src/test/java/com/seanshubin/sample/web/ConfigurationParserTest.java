package com.seanshubin.sample.web;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ConfigurationParserTest {
    @Test
    public void parseConfiguration() {
        //given
        String[] commandLineArguments = new String[]{"configured greeting target"};
        ConfigurationParser configurationParser = new ConfigurationParser();

        //when
        Configuration configuration = configurationParser.apply(commandLineArguments);

        //then
        assertThat(configuration.greetingTarget, is("configured greeting target"));
    }
}
