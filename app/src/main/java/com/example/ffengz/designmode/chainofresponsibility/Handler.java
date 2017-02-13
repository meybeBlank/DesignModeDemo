package com.example.ffengz.designmode.chainofresponsibility;

/**
 * Created by ffengz.
 *
 * 责任链  节点抽象类
 */
public abstract class Handler {
    // 下一个节点
    protected Handler mNextHandler;

    /**
     * 处理方法
     * @param message 信息
     */
    public abstract void handlerMessage(String message);

    /**
     * 设置下一个节点
     */
    public void setNextHandler(Handler handler){
        this.mNextHandler = handler;
    }
}
