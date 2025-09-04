package com.example.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.example.login.domain.User;
import com.example.login.repository.UserRepository;

@Controller
public class LoginController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public String home() {
        return "home.html";
    }
    @PostMapping("/login")
    @ResponseBody
    public String login(@RequestParam String username, @RequestParam String password) {
        User user = userRepository.findByUsernameAndPassword(username, password);
        if (user != null) {
            return "Login Successful! Welcome " + user.getUsername();
        } else {
            return "Invalid username or password";
        }
    }
}