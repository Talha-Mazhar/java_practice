package org.example.springbootwebapp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        System.out.println("Home method Called");
        // By default, jsp will not run, you need to convert it to servlet, by using tomcat jasper
        return "index";
    }
}
