package com.kcbgroup.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class SoapWebservicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SoapWebservicesApplication.class, args);
    }

}
