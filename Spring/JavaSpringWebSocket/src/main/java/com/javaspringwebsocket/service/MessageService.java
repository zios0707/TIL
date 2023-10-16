package com.javaspringwebsocket.service;

import com.javaspringwebsocket.config.model.Message;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    public void save(Message message) {
        System.out.println("작동 완료!");
    }
}
