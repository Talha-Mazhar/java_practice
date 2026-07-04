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

//    @RequestMapping("add")
//    public String add(HttpServletRequest req, HttpSession session) {
//        int num1  = Integer.parseInt(req.getParameter("num1"));
//        int num2 = Integer.parseInt(req.getParameter("num2"));
//        int result  = num1 + num2;
//        session.setAttribute("result", result);
//        return "result.jsp";
//    }
//    OR


//    num1 and num2 got detected because same names are being used by client also
//        @RequestMapping("add")
//        public String add(int num1, int num2, HttpSession session) {
//        OR num1 assigned to num
//        public String add(@RequestParam("num1") int num, int num2, HttpSession session) {
//            int result = num + num2;
//            int result = num1 + num2;
//            session.setAttribute("result", result);
//            return "result.jsp";
//        }
//

//        Without Session
//        @RequestMapping("add")
//        public ModelAndView add(@RequestParam("num1") int num, int num2, ModelAndView mv) {
//            int result = num + num2;
//            mv.addObject("result", result);
//            mv.setViewName("result");
//            return mv;
//        }
//    @RequestMapping("addAlien")
//    public ModelAndView add(@RequestParam("aid") int aid, @RequestParam("aname") String aname, ModelAndView mv) {
//
//        Alien alien = new Alien();
//
//        alien.setAid(aid);
//        alien.setAname(aname);
//
//        mv.addObject("alien", alien);
//        mv.setViewName("result");
//        return mv;
//    }
//        @RequestMapping("addAlien")
//        public String add(@ModelAttribute Alien alien) {
//            return "result";
//        }
        @RequestMapping("addAlien")
        public String add(Alien alien) {
            return "result";
        }
}
