package com.rambutech.authserver.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by chathuraka on 10/25/16.
 */
@SpringBootApplication
@ComponentScan
public class AppInitializer extends SpringBootServletInitializer{

    private static Class<AppInitializer> applicationClass = AppInitializer.class;

    public static void main(String [] args){
        SpringApplication.run(applicationClass,args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(applicationClass);
    }
}
