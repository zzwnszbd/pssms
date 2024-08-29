package com.chivotech.pssms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.chivotech.pssms.mapper")
public class PssmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(PssmsApplication.class, args);
    }

}
