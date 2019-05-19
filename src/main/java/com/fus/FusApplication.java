package com.fus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = { "com.fus.mapper" })
public class FusApplication {

    public static void main(String[] args) {
        SpringApplication.run(FusApplication.class, args);
    }

}
