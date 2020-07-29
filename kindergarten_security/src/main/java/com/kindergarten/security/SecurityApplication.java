package com.kindergarten.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SecurityApplication {
//sddgsg
    public static void main(String[] args) {
        SpringApplication.run(SecurityApplication.class, args);
    }

}
