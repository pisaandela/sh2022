package com.mazhike.sh2022;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.mazhike.sh2022.mapper")
public class Sh2022Application {

    public static void main(String[] args) {
        SpringApplication.run(Sh2022Application.class, args);
    }

}
