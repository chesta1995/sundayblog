package com.sunday.blog.sundayblog;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.sunday.blog.sundayblog.mapper")
public class SundayblogApplication {

    public static void main(String[] args) {
        SpringApplication.run(SundayblogApplication.class, args);
    }

}
