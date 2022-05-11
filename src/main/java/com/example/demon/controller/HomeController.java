package com.example.demon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.models.User;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {

    @RequestMapping("/index")
    public String hello() {
        return "index";
    }

    @RequestMapping("/thymeleaf")
    public String thyme(Model model) {
        System.out.println("entra aquí");
        model.addAttribute("user", new User());
        return "thyme";
    }

    @RequestMapping(value = "showdata", method = RequestMethod.GET)
    public String showdata(HttpServletRequest request, Model model) {
        System.out.println("ver usuario");
        String name = request.getParameter("user_name");
        String email = request.getParameter("email");
        System.out.println(email);
        System.out.println(name);
//        model.addAttribute("name", name);
        return "user-data";
    }
}