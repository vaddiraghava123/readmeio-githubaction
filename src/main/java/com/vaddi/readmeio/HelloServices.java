package com.vaddi.readmeio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloServices {

    @GetMapping("/hello")
    public String sayHello() {
    	System.out.println("<<<< -- Calling Hello Service  -- >>>> ");
        return "Hello, World!";
    }
}
