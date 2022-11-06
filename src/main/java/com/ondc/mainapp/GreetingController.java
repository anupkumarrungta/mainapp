package com.ondc.mainapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/")
    public String test(){
        System.out.println("### Rest API HIT /");
        return "Test Root Check OK";
    }

    @GetMapping("/healthcheck")
    public String healthcheck(){
        System.out.println("### Rest API HIT /");
        return "HealthCheck OK";
    }
    @GetMapping("/rest-greeting")
    public RestGreeting greeting(@RequestParam(value="name", defaultValue = "World") String name){
        System.out.println("### Rest API HIT /rest-greeting");
        return new RestGreeting(counter.incrementAndGet(), String.format(template,name));
    }
}
