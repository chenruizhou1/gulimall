package com.gulimall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@MapperScan("com.gulimall.dao")
@SpringBootApplication
public class WareMain {

    public static void main(String[] args) {
        SpringApplication.run(WareMain.class, args);
    }

}
