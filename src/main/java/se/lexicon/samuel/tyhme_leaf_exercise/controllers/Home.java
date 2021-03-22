package se.lexicon.samuel.tyhme_leaf_exercise.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Home {

    private List<String> addresses = new ArrayList<>();

    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/contact")
    public String contact(Model model){
        model.addAttribute("strings", addresses);
        return "contact";
    }

    @PostMapping("/contact")
    public String contact(@RequestParam("address") String address){
        addresses.add(address);
        return "contact";
    }

    @GetMapping("/about")
    public String about(){
        return "about";
    }




}

