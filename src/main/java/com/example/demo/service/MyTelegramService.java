package com.example.demo.service;
import com.example.demo.model.Message;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

@Service
public class MyTelegramService extends TelegramLongPollingBot {

    @Override
    public void onUpdateReceived(Update update) {
    }

    @Override
    public String getBotUsername() {
        // Return bot username
        // If bot username is @TelegramBot, it must return 'TelegramBot'
        return "TelegramBot_ChocoPowder";
    }

    @Override
    public String getBotToken() {
        return "1526549442:AAHAAAMNkkYt0iTMTTh-fQB1SiBn13kfYQk";
    }

    public void sendMessage(Message message) {
        String urlString = "https://api.telegram.org/bot%s/sendMessage?chat_id=%s&text=%s";
        String apiToken = "1526549442:AAHAAAMNkkYt0iTMTTh-fQB1SiBn13kfYQk";
        String chatId = "688696597";
        String text = message.getContext();

        urlString = String.format(urlString, apiToken, chatId, text);

        try {
            URL url = new URL(urlString);
            URLConnection conn = url.openConnection();
            InputStream is = new BufferedInputStream(conn.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
