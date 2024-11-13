package com.zss.commission_service;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@MapperScan("com.zss.scc.dao.mapper")
public class CommissionServiceApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(CommissionServiceApplication.class, args);
    }
    
}
