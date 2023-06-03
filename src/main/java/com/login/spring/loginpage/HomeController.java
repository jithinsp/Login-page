package com.login.spring.loginpage;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("message","UserName");
        return "home";
    }
    @GetMapping("/")
    public String login() {
        return "login";
    }
}
