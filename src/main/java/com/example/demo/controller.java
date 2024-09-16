package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
@Controller
public class controller {
	@RequestMapping("demopage")
	public String disp(HttpServletRequest req) {
		 //public String disp(@RequestParam("name")String n,HttpSession session
		//{
		HttpSession session=req.getSession();
		String n=req.getParameter("name");
		session.setAttribute("name", n);
		System.out.println("My name is "+n);
		return "demo";
	}
//	public String disp() {
//		System.out.println("jsp");
//		return "demo";
//	}
}
