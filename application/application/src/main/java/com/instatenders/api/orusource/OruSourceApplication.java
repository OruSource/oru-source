package com.instatenders.api.orusource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.instatenders"})
public class OruSourceApplication {
    public static void main(String[] args) {
        SpringApplication.run(OruSourceApplication.class, args);
    }
}
