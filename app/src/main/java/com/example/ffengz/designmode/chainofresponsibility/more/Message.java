package com.example.ffengz.designmode.chainofresponsibility.more;

/**
 * Created by ffengz.
 *
 * 消息抽象类
 */
public abstract class Message {
    private String message;

    // 创建消息
    public Message(String message){
        this.message = message;
    }

    /**
     * 获取消息内容
     */
    public String getMessage() {
        return message;
    }

    /**
     * 获取消息的发送对象
     */
    public abstract String getRequestParter();
}
