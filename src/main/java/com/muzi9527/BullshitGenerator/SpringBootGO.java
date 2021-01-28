package com.muzi9527.BullshitGenerator;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.muzi9527.BullshitGenerator.mapper")
public class SpringBootGO {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootGO.class, args);
    }
}
