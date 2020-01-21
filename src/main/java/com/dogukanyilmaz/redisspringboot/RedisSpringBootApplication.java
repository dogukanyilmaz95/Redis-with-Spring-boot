package com.dogukanyilmaz.redisspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class RedisSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisSpringBootApplication.class, args);
    }

}
