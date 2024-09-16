package com.SpringBoot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
@Controller
public class controller {
	@RequestMapping("demopage")
	
	public String disp(HttpServletRequest req, HttpSession session) {
		// public String disp(@RequestParam("name") String n,HttpSession session)
		//{
//		HttpSession session=req.getSession();
		String n=req.getParameter("name");
		String n1=req.getParameter("regd");
		String n2=req.getParameter("gender");
		session.setAttribute("name", n);
		session.setAttribute("regd", n1);
		session.setAttribute("gender", n2);
		System.out.println("My name is "+n);
		return "demo";
	}
}
