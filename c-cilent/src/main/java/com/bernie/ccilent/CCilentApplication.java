package com.bernie.ccilent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CCilentApplication {

    public static void main(String[] args) {
        SpringApplication.run(CCilentApplication.class, args);
    }

}
