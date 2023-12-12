package com.example.restaurant;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RestaurantController {

    @GetMapping(value="")
    public String index(Model model) {
        model.addAttribute("restaurantName", "Delicious Eats");
        return "index";
    }
}

