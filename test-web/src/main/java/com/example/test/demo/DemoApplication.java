package com.example.test.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        System.out.println("分支1");
        SpringApplication.run(DemoApplication.class, args);
        System.out.println("分支切换！！！");
    }

}
