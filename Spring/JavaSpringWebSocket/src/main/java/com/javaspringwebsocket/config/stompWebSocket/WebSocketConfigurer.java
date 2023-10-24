package com.javaspringwebsocket.config.stompWebSocket;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfigurer implements WebSocketMessageBrokerConfigurer {

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry){
        registry.enableSimpleBroker("/sub");// 구독
        registry.setApplicationDestinationPrefixes("/pub"); // 발행
    }

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry
                .addEndpoint("/ws")
                .setAllowedOrigins("*"); // CORS 랑 비슷한 개념
                                         // 뭐에 쓰이는지 모르겠음. 일단 전부 허용으로 하고
                                         // 나중에 CORS 적용하면 같이 설정하는 방향으로 할 듯.
    }
}
