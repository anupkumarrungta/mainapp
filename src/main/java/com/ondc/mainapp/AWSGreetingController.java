package com.ondc.mainapp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AWSGreetingController {

    @Autowired
    private DynamoDBEnhanced dde;

    @Autowired
    private PublishTextSMS msg;
/*
    @GetMapping("/getty")
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "greeting";
    }

    @PostMapping("/aws-greeting")
    public String greetingSubmit(@ModelAttribute Greeting greeting) {

        // Stores data in an Amazon DynamoDB table.
        dde.injectDynamoItem(greeting);

        // Sends a text notification.
        msg.sendMessage(greeting.getId());

        return "result";
    }
    */

    @GetMapping("/getty")
    public Greeting getty(@RequestParam(value="name", defaultValue = "World") String name) {

        System.out.println("#### API HIT AWS /getty");
        return new Greeting();
    }

    @PostMapping("/aws-greeting")
    public String greeting(@RequestAttribute("greeting") Greeting greeting) {
//    public String greetingSubmit(@ModelAttribute("greeting") Greeting greeting) {

        System.out.println("#### API HIT AWS /aws-greeting");

        // Stores data in an Amazon DynamoDB table.
        dde.injectDynamoItem(greeting);

        // Sends a text notification.
        msg.sendMessage(greeting.getId());

        return "result";
    }
}