package com.example.stargame.bot;

import com.example.stargame.entity.Users;
import com.example.stargame.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;


@Component
public class MainBot extends TelegramLongPollingBot {

    @Autowired
    UsersService usersService;


    @Value("${bot.name}")
    private String botUsername;

    @Value("${bot.token}")
    private String botToken;

//    public void setUsersRepository(Users users){
//        SendMessage sendMessage = new SendMessage();
////            Optional<Users> optionalUsers = usersRepository.findById(id);
//        sendMessage.setChatId(String.valueOf(users.getId()));
//        sendMessage.setText(users.getName()+" "+users.getEmail()+" "+users.getMessage());
//        try {
//            execute(sendMessage);
//        } catch (TelegramApiException e) {
//            e.printStackTrace();
//        }
//    }



//
         public void usersList(Users users) {
        try {
            SendMessage sendMessage = new SendMessage();
            sendMessage.setText(users.getMessage()+""+users.getName()+" "+users.getEmail()+" "+users.getSubject());
            sendMessage.setChatId(String.valueOf(users.getId()));
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getBotToken() {
        return botToken;
    }

    @Override
    public String getBotUsername() {
        return botUsername;
    }


    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            String message_text = update.getMessage().getText();
            long chat_id = update.getMessage().getChatId();

            SendMessage message = new SendMessage(); // Create a message object object
                    message.setChatId(String.valueOf(chat_id));
                    message.setText(message_text);
        try {
            execute(message);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    }
}
