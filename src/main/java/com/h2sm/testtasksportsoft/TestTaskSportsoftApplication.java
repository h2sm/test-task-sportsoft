package com.h2sm.testtasksportsoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@ComponentScan(basePackages = "com.h2sm.testtasksportsoft")
@EnableWebMvc
public class TestTaskSportsoftApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestTaskSportsoftApplication.class, args);
    }

}
