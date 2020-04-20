package com.sunday.blog.sundayblog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.sunday.blog.sundayblog.mapper"})
public class SundayblogApplication {

    public static void main(String[] args) {
        SpringApplication.run(SundayblogApplication.class, args);
    }

}
