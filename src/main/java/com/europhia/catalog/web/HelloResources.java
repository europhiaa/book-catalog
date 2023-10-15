package com.europhia.catalog.web;

import com.europhia.catalog.service.GreetingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResources {

    private GreetingService greetingService;

    public HelloResources(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/hello")
    public String helloworld(){
        return greetingService.sayGreeting();
    }
}
