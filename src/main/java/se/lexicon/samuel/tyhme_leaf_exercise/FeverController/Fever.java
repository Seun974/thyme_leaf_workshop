package se.lexicon.samuel.tyhme_leaf_exercise.FeverController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Fever {
    private double temperature;

    @GetMapping("/fever")
    public String fever(){

        return "fever";
    }



}
