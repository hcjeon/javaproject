package com.hcjeon.main;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class StandalonejarApplication {

    @RequestMapping("/main")
    String main() {
        return "Hello World";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(StandalonejarApplication.class, args);
    }
}
