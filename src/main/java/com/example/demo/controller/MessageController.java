package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    @PostMapping("/sendMessage.html") {
        public void send(@RequestBody Message message){
            sendMessage(message);
        }
    }
}
