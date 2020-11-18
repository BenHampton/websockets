package com.web.websocket.model;

import lombok.Data;

import java.awt.*;

@Data
public class Message {

    public enum MessageType {
        CHAT,
        JOIN,
        LEAVE
    }

    private MessageType type;

    private String content;

    private String sender;
}
