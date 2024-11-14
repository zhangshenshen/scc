package com.zss.commission_service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.zss.scc.dao.mapper")
public class CommissionServiceApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(CommissionServiceApplication.class, args);
    }
    
}
