package com.hcjeon.firstapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class FirstapplicationApplication {

    @RequestMapping("/")
    String home() {
        return "ss";
    }

    public static void main(String[] args) {
        SpringApplication.run(FirstapplicationApplication.class, args);
    }
}
