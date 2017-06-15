package com.emusicstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by The Revenant on 6/15/2017.
 */

@Controller

public class HomeController {
    @RequestMapping("/")
    public String home(){
        return "home";
    }

}
