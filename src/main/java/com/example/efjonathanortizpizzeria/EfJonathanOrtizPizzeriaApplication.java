package com.example.efjonathanortizpizzeria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EfJonathanOrtizPizzeriaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EfJonathanOrtizPizzeriaApplication.class, args);
    }

}
