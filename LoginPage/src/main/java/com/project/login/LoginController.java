package com.project.login;

import com.project.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String showLoginPage() {
        return "Login";
    }

    @PostMapping("/login")
    public String handleLogin(
            @RequestParam("userid") String userId,
            @RequestParam("password") String password,
            Model model) {

        LoginBean loginBean = new LoginBean();
        loginBean.setUserId(userId);
        loginBean.setPassword(password);

        if (loginBean.validate()) {
            return "Welcome";
        } else {
            model.addAttribute("errorMessage", "User ID or Password is incorrect.");
            return "Login";
        }
    }
}
