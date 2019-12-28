package com.heshi.service01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@EnableFeignClients(basePackages = "com.heshi.api1")
@ComponentScan({"com.heshi.api1", "com.heshi.service01"})
@SpringBootApplication
public class Service1App {
    public static void main(String args[]) {
        SpringApplication.run(Service1App.class, args);
    }
}
