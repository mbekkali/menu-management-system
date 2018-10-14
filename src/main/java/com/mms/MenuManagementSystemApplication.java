package com.mms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.mms")
@SpringBootApplication
public class MenuManagementSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(MenuManagementSystemApplication.class, args);
    }
}
