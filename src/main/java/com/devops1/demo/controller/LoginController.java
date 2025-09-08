package com.devops1.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.devops1.demo.domain.Users;
import com.devops1.demo.repository.UsersRepository;

@Controller
public class LoginController {

    @Autowired
    private UsersRepository userRepository;

    @GetMapping("/")
    public String home() {
        return "summa.html";
    }
    @PostMapping("/login")
    @ResponseBody
    public String login(@RequestParam String username, @RequestParam String password) {
        Users user = userRepository.findByUsernameAndPassword(username, password);
        if (user != null) {
            return "Login Successful! Welcome " + user.getUsername();
        } else {
            return "Invalid username or password";
        }
    }
}