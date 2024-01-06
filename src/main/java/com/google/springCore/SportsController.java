package com.google.springCore;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SportsController {

    @GetMapping("/cricket")
    public String getDailyWorkout(){
        return "Wait for now , Coach is sleeping";
    }

    @GetMapping("/hello")
    public String getGretting(){
        return "Hello Peoples";
    }
}
