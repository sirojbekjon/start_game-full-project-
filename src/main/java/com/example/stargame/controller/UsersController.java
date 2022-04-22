package com.example.stargame.controller;

import com.example.stargame.entity.Users;
import com.example.stargame.repository.UsersRepository;
import com.example.stargame.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;

@Controller
public class UsersController {

    @Autowired
    UsersService usersService;


    @GetMapping("/home")
    public String home(){
        return "index.html";
    }


    @PostMapping("/postusers")
    public void create(@RequestParam("name") String name,
                         @RequestParam("email") String email,
                         @RequestParam("subject") String subject,
                         @RequestParam("message") String message, Model model) throws IOException {
        usersService.addUsers(name, email, subject, message);
    }
}





