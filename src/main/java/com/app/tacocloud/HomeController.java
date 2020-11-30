package com.app.tacocloud;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/") // handles the requests for the root path
    public String home() {

        return "home"; // returns the view name
    }
}
