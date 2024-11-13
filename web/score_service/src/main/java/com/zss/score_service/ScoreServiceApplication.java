package com.zss.score_service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zss.scc.dao.mapper")
public class ScoreServiceApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(ScoreServiceApplication.class, args);
    }
    
}
