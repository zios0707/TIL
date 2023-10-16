package com.javaspringwebsocket.controller;

import com.javaspringwebsocket.config.model.Message;
import com.javaspringwebsocket.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequiredArgsConstructor
public class StompMessageController {

    private final SimpMessageSendingOperations simpMessageSendingOperations;

    private final MessageService messageService;

/*
    /sub/channel/123 // 구독 ( channelId : 123 )
    /pub/hello       // 발행
*/

    @MessageMapping("/hello")
    public void message(Message message) {

        messageService.save(message);

        simpMessageSendingOperations.convertAndSend("/sub/channel/" + message.getChannelId(), message);
    }

/*    @GetMapping("/{channelId}")
    public void getMessageList(@PathVariable String channelId) {

    }*/

}
