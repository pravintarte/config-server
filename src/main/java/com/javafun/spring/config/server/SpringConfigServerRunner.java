package com.javafun.spring.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringConfigServerRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringConfigServerRunner.class,args);
    }


}
