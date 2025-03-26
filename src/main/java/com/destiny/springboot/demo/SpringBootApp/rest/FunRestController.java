package com.destiny.springboot.demo.SpringBootApp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/")
    public String sayHello(){
        return "Hello World";
    }

    @GetMapping("/workout")
    public String showWorkout(){
        return "Show workout";
    }

    @GetMapping("/fortune")
    public String haveFortune(){
        return "Blessed with fortune";
    }

    @GetMapping("/team-info")
    public String getTeamInfo(){
        return "Coach: "+ coachName + " and Team: " + teamName;
    }
}
