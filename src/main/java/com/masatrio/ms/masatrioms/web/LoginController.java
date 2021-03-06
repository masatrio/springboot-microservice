package com.masatrio.ms.masatrioms.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	@Value("${spring.application.name}")
    String appName;
 
    @GetMapping("/boom")
    public String homePage(Model model) {
        model.addAttribute("appName", appName);
        return "home";
    }
}
