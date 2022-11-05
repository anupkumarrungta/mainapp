package com.ondc.mainapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BppRequestApiController {

    private static String logger = "BppRequestApiController::";

    @GetMapping("/cancel")
    public void cancel(@RequestParam(value="name", defaultValue = "World") String name){
        System.out.println(logger+"cancel method - called" );
    }

    @GetMapping("/cancellation_reasons")
    public void cancellation_reasons(@RequestParam(value="name", defaultValue = "World") String name){
        System.out.println(logger+"cancellation_reasons method - called" );
    }
    @GetMapping("/feedback_categories")
    public void feedback_categories(@RequestParam(value="name", defaultValue = "World") String name){
        System.out.println(logger+"feedback_categories method - called" );
    }
    @GetMapping("/feedback_form")
    public void feedback_form(@RequestParam(value="name", defaultValue = "World") String name){
        System.out.println(logger+"feedback_form method - called" );
    }
    @GetMapping("/get_cancellation_reasons")
    public void get_cancellation_reasons(@RequestParam(value="name", defaultValue = "World") String name){
        System.out.println(logger+"get_cancellation_reasons method - called" );
    }
    @GetMapping("/get_feedback_categories")
    public void get_feedback_categories(@RequestParam(value="name", defaultValue = "World") String name){
        System.out.println(logger+"get_feedback_categories method - called" );
    }
    @GetMapping("/get_feedback_form")
    public void get_feedback_form(@RequestParam(value="name", defaultValue = "World") String name){
        System.out.println(logger+"get_feedback_form method - called" );
    }
    @GetMapping("/get_rating_categories")
    public void get_rating_categories(@RequestParam(value="name", defaultValue = "World") String name){
        System.out.println(logger+"get_rating_categories method - called" );
    }
    @GetMapping("/get_return_reasons")
    public void get_return_reasons(@RequestParam(value="name", defaultValue = "World") String name){
        System.out.println(logger+"get_return_reasons method - called" );
    }
    @GetMapping("/init")
    public void init(@RequestParam(value="name", defaultValue = "World") String name){
        System.out.println(logger+"init method - called" );
    }
    @GetMapping("/on_cancel")
    public void on_cancel(@RequestParam(value="name", defaultValue = "World") String name){
        System.out.println(logger+"on_cancel method - called" );
    }


    @GetMapping("/on_init")
    public void on_init(@RequestParam(value="name", defaultValue = "World") String name){
        System.out.println(logger+"on_init method - called" );
    }
    @GetMapping("/on_rating")
    public void on_rating(@RequestParam(value="name", defaultValue = "World") String name){
        System.out.println(logger+"on_rating method - called" );
    }
    @GetMapping("/on_search")
    public void on_search(@RequestParam(value="name", defaultValue = "World") String name){
        System.out.println(logger+"on_search method - called" );
    }
    @GetMapping("/on_confirm")
    public void on_confirm(@RequestParam(value="name", defaultValue = "World") String name){
        System.out.println(logger+"on_confirm method - called" );
    }
    @GetMapping("/on_select")
    public void on_select(@RequestParam(value="name", defaultValue = "World") String name){
        System.out.println(logger+"on_select method - called" );
    }
    @GetMapping("/on_status")
    public void on_status(@RequestParam(value="name", defaultValue = "World") String name){
        System.out.println(logger+"on_status method - called" );
    }
    @GetMapping("/on_support")
    public void on_support(@RequestParam(value="name", defaultValue = "World") String name){
        System.out.println(logger+"on_support method - called" );
    }
    @GetMapping("/on_track")
    public void on_track(@RequestParam(value="name", defaultValue = "World") String name){
        System.out.println(logger+"on_track method - called" );
    }
    @GetMapping("/on_update")
    public void on_update(@RequestParam(value="name", defaultValue = "World") String name){
        System.out.println(logger+"on_update method - called" );
    }
    @GetMapping("/rating")
    public void rating(@RequestParam(value="name", defaultValue = "World") String name){
        System.out.println(logger+"rating method - called" );
    }

    @GetMapping("/rating_categories")
    public void rating_categories(@RequestParam(value="name", defaultValue = "World") String name){
        System.out.println(logger+"rating_categories method - called" );
    }
    @GetMapping("/return_reasons")
    public void return_reasons(@RequestParam(value="name", defaultValue = "World") String name){
        System.out.println(logger+"return_reasons method - called" );
    }
    @GetMapping("/search")
    public void search(@RequestParam(value="name", defaultValue = "World") String name){
        System.out.println(logger+"search method - called" );
    }
    @GetMapping("/select")
    public void select(@RequestParam(value="name", defaultValue = "World") String name){
        System.out.println(logger+"select method - called" );
    }
    @GetMapping("/status")
    public void status(@RequestParam(value="name", defaultValue = "World") String name){
        System.out.println(logger+"status method - called" );
    }
    @GetMapping("/support")
    public void support(@RequestParam(value="name", defaultValue = "World") String name){
        System.out.println(logger+"support method - called" );
    }
    @GetMapping("/track")
    public void track(@RequestParam(value="name", defaultValue = "World") String name){
        System.out.println(logger+"track method - called" );
    }
    @GetMapping("/update")
    public void update(@RequestParam(value="name", defaultValue = "World") String name){
        System.out.println(logger+"update method - called" );
    }

}
