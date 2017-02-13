package com.example.ffengz.designmode.chainofresponsibility.more;

/**
 * Created by ffengz.
 *
 * 消息B
 */
public class MessageB extends Message {

    public MessageB(String message) {
        super(message);
    }

    @Override
    public String getRequestParter() {
        return "B";
    }
}
