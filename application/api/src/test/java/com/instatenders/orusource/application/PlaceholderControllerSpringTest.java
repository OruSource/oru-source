package com.instatenders.orusource.application;

import org.jmock.Mockery;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * This is a test of the spring annotations / wiring only.
 */
@WebAppConfiguration
@ContextConfiguration
@DirtiesContext
@ExtendWith(SpringExtension.class)
public class PlaceholderControllerSpringTest {
    @EnableWebMvc
    @Configuration
    static class SpringConfiguration extends WebMvcConfigurationSupport {
        @Bean
        public Mockery context() {
            return new Mockery();
        }

    }
}