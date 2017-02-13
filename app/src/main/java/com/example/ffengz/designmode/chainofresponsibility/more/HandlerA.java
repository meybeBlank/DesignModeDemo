package com.example.ffengz.designmode.chainofresponsibility.more;

import android.util.Log;

/**
 * Created by ffengz.
 *
 * 处理者A 继承消息处理接口
 */
public class HandlerA extends Handler {
    @Override
    public String getHandlerName() {
        return "A";
    }

    @Override
    public void handleMessage(String message) {
        Log.i("info", "handMessage: ==++  A接收了消息   " + message);
    }
}
