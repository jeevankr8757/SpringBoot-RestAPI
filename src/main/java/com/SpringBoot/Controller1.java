package com.SpringBoot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpSession;

@Controller
public class Controller1 { 
    @RequestMapping("demopage1")
    public ModelAndView display(@RequestParam("name") String name, 
                                @RequestParam("regd") String regd, 
                                @RequestParam("gender") String gender,
                                HttpSession session) {

        ModelAndView mv = new ModelAndView();
        mv.setViewName("Home");
        mv.addObject("name", name);
        mv.addObject("regd", regd);
        mv.addObject("gender", gender);
        session.setAttribute("name", name);
        session.setAttribute("regd", regd);
        session.setAttribute("gender", gender);
        System.out.println("My name is " + name + " Registration No:-" + regd + " Gender:-" + gender);
        return mv;
    }
}
