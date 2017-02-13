package com.example.ffengz.designmode.chainofresponsibility.more;

import android.util.Log;

/**
 * Created by ffengz.
 *
 * 消息处理抽象类
 */
public abstract class Handler {
    // 下一个处理节点
    protected Handler mNextHandler;

    // 获取处理者名字
    public abstract String getHandlerName();

    // 具体的处理方式
    public abstract void handleMessage(String message);

    // 下个节点设置
    public void setNext(Handler handler){
        this.mNextHandler = handler;
    }

    /**
     * 对消息进行集中处理，子类不能修改处理方式
     */
    public final void handleMessage(Message message){
        // 发送给当前节点
        if (getHandlerName().equals(message.getRequestParter())){
            handleMessage(message.getMessage());
        } else {
            // 传递给下一个节点
            if (mNextHandler != null){
                mNextHandler.handleMessage(message);
            }else{
                Log.i("info", "handleMessage: ==++  没有该同学，错误信息");
            }
        }
    }
}
