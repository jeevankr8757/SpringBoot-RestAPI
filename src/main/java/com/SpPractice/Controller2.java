package com.SpPractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controller2 {

    @Autowired
    private Student1 student1;

    @RequestMapping("psychopage") 
    public ModelAndView display(@RequestParam("name") String name, @RequestParam("mark") String mark) {
     
        student1.setName(name);
        student1.setMark(mark);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("student1", student1);
        modelAndView.setViewName("Student");

        System.out.println("Student Name: " + student1.getName() + ", Mark: " + student1.getMark());
        return modelAndView;
    }
}