package edu.udacity.java.nano.chat;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * WebSocket message model
 */
public class Message {
    // TODO: add message model.
    @JSONField(name = "username")
    private String username;

    @JSONField(name = "msg")
    private String message;

    @JSONField(name = "counter")
    private int counter = 0;

    @JSONField(name = "type")
    private String type = "SEND";


    public Message(){}

    public Message(String username, String message, int counter, String type, String status){
        this.username = username;
        this.message = message;
        this.counter = counter;
        this.type = type;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public void setType(String type) {
        this.type = type;
    }


    public String getUsername() {
        return username;
    }

    public String getMessage() {
        return message;
    }

    public int getCounter() {
        return counter;
    }

    public String getType() {
        return type;
    }
    }

