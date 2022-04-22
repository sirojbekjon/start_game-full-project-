package com.example.stargame.bot;

import com.example.stargame.entity.Users;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class ChatBot extends TelegramLongPollingBot{

//    @Autowired
//    UsersRepository usersRepository;

//    public static void main(String[] args) {
//        ApiContextInitializer.init();
//        TelegramBotsApi api = new TelegramBotsApi();
//
//        try {
//            api.registerBot(new ChatBot());
//        }catch (TelegramApiRequestException e) {
//            e.printStackTrace();
//        }
//    }




//    public void setUsersRepository(Integer id){
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



    @Override
    public void onUpdateReceived(Update update) {
//        update.getMessage().
        System.out.println(update);
       /* if (update.getMessage()!=null){
            String inputText=update.getMessage().getText();
            SendMessage sendMessage=new SendMessage();
            sendMessage.setChatId(update.getMessage().getChatId());
            Scanner scanner = new Scanner(System.in);
//        System.out.println(inputText);

            if (inputText.equals("/start")){
                sendMessage.setText("Botga hush kelibsiz");
            }
            else{
                if(inputText.toLowerCase().equals("salom") || inputText.toLowerCase().equals("assalomalaykum")){
                    sendMessage.setText("Va-Alaykum assalom");
                }else if (inputText.toLowerCase().equals("qalay")||inputText.toLowerCase().equals("qalesan")){
                    sendMessage.setText("yaxshi o\'zing yaxshimi");
                }else if(inputText.toLowerCase().equals("siroch")
                        ||inputText.toLowerCase().equals("mamur")
                        ||inputText.toLowerCase().equals("shohruh")
                        ||inputText.toLowerCase().equals("behzod")
                        ||inputText.toLowerCase().equals("sirojiddin")
                        ||inputText.toLowerCase().equals("meko")
                        ||inputText.toLowerCase().equals("shoxrux")
                        ||inputText.toLowerCase().equals("dilmirot")
                        ||inputText.toLowerCase().equals("siroj")
                        ||inputText.toLowerCase().equals("nodir")
                        ||inputText.toLowerCase().equals("bobir")
                        ||inputText.toLowerCase().equals("bobur")
                        ||inputText.toLowerCase().equals("ozod")
                        ||inputText.toLowerCase().equals("dostim")
                        ||inputText.toLowerCase().equals("atam")
                ){


                    sendMessage.setText(inputText+" senga hozir bekorchi odam emasku darrow javob qaytaradigan sabr qilib tur. sabr tagi sariq oltin deyishadiku vuaxaxaxxaxaxaxa");
                }else if(inputText.toLowerCase().equals("sardor")){
                    sendMessage.setText(inputText+"  hozir mahalla vazirligida majlisda Parpiyev gazini beryapti darrow javob qaytaradigan ahvolda emas sabr qilib tur. sabr tagi sariq oltin deyishadiku vuaxaxaxxaxaxaxa");

                }

                else{
                    System.out.println(inputText);
                    String ansver = scanner.nextLine();
                    sendMessage.setText(ansver);
                }


            }

            ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
            sendMessage.setReplyMarkup(keyboardMarkup);
            keyboardMarkup.setResizeKeyboard(true);
            keyboardMarkup.setOneTimeKeyboard(true);
            keyboardMarkup.setSelective(true);

            List<KeyboardRow> keyboardRows=new ArrayList<>();
            KeyboardRow row1=new KeyboardRow();
            KeyboardButton button1 = new KeyboardButton("lug\'at");
            KeyboardButton button2 = new KeyboardButton("chat");
            KeyboardButton button3 = new KeyboardButton("valyuta");
            row1.add(button1);
            row1.add(button2);
            row1.add(button3);
            keyboardRows.add(row1);
            keyboardMarkup.setKeyboard(keyboardRows);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }*/
    }

    @Override
    public String getBotUsername() {
        return "Ttekshiruvdagi_bot";
    }

    @Override
    public String getBotToken() {
        return "1593323228:AAHeasfURInbruUuhoHGwpwhSEHugyCG9jc";
    }
}
