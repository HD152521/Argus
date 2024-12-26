package com.sejong.project.argus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class ArgusApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArgusApplication.class, args);
    }

}
