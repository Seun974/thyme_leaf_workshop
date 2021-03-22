package se.lexicon.samuel.tyhme_leaf_exercise.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Home {

    @GetMapping("/index")
    public String welcomePage(){
        return "index";
    }
}

