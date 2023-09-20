package com.javaspringwebsocket.controller;

import com.javaspringwebsocket.Entity.Greeting;
import com.javaspringwebsocket.Entity.HelloMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class GreetingController {

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting greeting(HelloMessage helloMessage) throws Exception {
        return new Greeting("어서오세요, " +
                HtmlUtils.htmlEscape(helloMessage.getName()) + "!");
    }
}
