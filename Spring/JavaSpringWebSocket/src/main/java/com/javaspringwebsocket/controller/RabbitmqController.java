package com.javaspringwebsocket.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RabbitmqController {

    private static final String EXCHANGE_NAME = "sample.exchange";

    private final RabbitTemplate rabbitTemplate;

    @GetMapping("sample/queue")
    public String rabbitmqPublish() {
        rabbitTemplate.convertAndSend(EXCHANGE_NAME, "sample.routing.#", "RabbitMQ + SpringBoot = Success");
        return "Message sending";
    }
}
