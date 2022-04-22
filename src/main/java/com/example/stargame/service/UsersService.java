package com.example.stargame.service;

import com.example.stargame.bot.ChatBot;
import com.example.stargame.bot.MainBot;
import com.example.stargame.entity.Users;
import com.example.stargame.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.objects.Update;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Optional;

@Service
public class UsersService {

    @Autowired
    UsersRepository usersRepository;

    public String addUsers(String name,String email,String subject,String message)throws IOException {

        Users users = new Users();
        users.setName(name);
        users.setMessage(message);
        users.setEmail(email);
        users.setSubject(subject);
        usersRepository.save(users);
        MainBot mainBot = new MainBot();
        mainBot.onUpdateReceived(new Update());
        mainBot.usersList(users);
    return "redirect:/index.html";
        }
}



