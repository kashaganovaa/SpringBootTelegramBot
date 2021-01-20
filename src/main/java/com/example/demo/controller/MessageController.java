package com.example.demo.controller;

import com.example.demo.model.Message;
import com.example.demo.service.MyTelegramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    private final MyTelegramService myTelegramService;

    @Autowired
    public MessageController(MyTelegramService myTelegramService) {
        this.myTelegramService = myTelegramService;
    }

    @PostMapping("/sendMessage")
    public String send(@RequestBody Message message) {
        myTelegramService.sendMessage(message);

        return "OK";
    }
}
