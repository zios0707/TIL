package com.javaspringwebsocket.config;

import com.javaspringwebsocket.config.model.Message;
import com.javaspringwebsocket.helper.JsonToObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Slf4j
public class WebSocketHandler extends TextWebSocketHandler {

    private final Map<String, WebSocketSession> sessions = new ConcurrentHashMap<>();
    //          key : 세션 ID, value : 세션

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        var sessionId = session.getId();
        sessions.put(sessionId, session); // 세션을 저장 합니당

        Message message = Message.builder()
                .sender(sessionId)
                .receiver("all")
                .build();
        message.newConnect();

        sessions.values().forEach(s -> {
            try {
                if(!s.getId().equals(sessionId)) {
                    s.sendMessage(new TextMessage(message.getSender() + "님이 대화에 참가하셨습니다."));
                }
            }catch (Exception e) {
                //TODO : Exception code
            }
        });

    }

    @Override
    public void handleTextMessage(WebSocketSession session, TextMessage textMessage) throws IOException {
        Message message = JsonToObject.toObject(textMessage.getPayload(), Message.class);

        System.out.println(message.getData());
        System.out.println(message.getType());
        System.out.println(message.getReceiver());
        message.setSender(session.getId());

        WebSocketSession receiver = sessions.get(message.getReceiver());
        // 메시지를 받을 상대방을 찾음
        if (receiver != null && receiver.isOpen()) {
            // 타겟이 존재함 + 타겟이 연결됨 이라면 메시지 전송
            receiver.sendMessage(new TextMessage((CharSequence) message.getData()));
        }
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) {

    }

    @Override
    public void handleTransportError(WebSocketSession session, Throwable error) {

    }

}
