package com.example.SpringBootWebApp1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @ModelAttribute("course")
    public String courseName() {
        return "JavaScript";
    }

    @RequestMapping("/")
    public String home() {
        System.out.println("Print Home Controller");
        return "index";
    }

    @RequestMapping("addAlien")
    public String add(Alien alien) {
        return "result";
    }
}
