package com.heshi.service02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author fukun
 */
@EnableFeignClients(basePackages = "com.heshi.api1")
@SpringBootApplication
@ComponentScan({"com.heshi.api1", "com.heshi.service02"})
@EnableDiscoveryClient
public class Service2App {
    public static void main(String[] args) {
        SpringApplication.run(Service2App.class, args);
    }
}
