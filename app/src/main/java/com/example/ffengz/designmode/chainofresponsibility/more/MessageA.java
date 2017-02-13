package com.example.ffengz.designmode.chainofresponsibility.more;

/**
 * Created by ffengz.
 *
 * 消息A 继承消息抽象类
 */
public class MessageA extends Message {

    public MessageA(String message) {
        super(message);
    }

    @Override
    public String getRequestParter() {
        return "A";
    }
}
