package com.instatenders.orusource.application.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.support.OpenEntityManagerInViewFilter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {
    @Bean
    public OpenEntityManagerInViewFilter oruSourceConfigEntityManagerInViewFilter()
    {
        OpenEntityManagerInViewFilter osivFilter = new OpenEntityManagerInViewFilter();
        osivFilter.setEntityManagerFactoryBeanName("configEntityManagerFactory");
        return osivFilter;
    }

    @Bean
    public OpenEntityManagerInViewFilter oruSourceServiceEntityManagerInViewFilter()
    {
        OpenEntityManagerInViewFilter osivFilter = new OpenEntityManagerInViewFilter();
        osivFilter.setEntityManagerFactoryBeanName("serviceEntityManagerFactory");
        return osivFilter;
    }
}
