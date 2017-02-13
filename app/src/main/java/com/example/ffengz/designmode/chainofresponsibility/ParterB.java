package com.example.ffengz.designmode.chainofresponsibility;

import android.util.Log;

/**
 * Created by ffengz.
 *
 * 伙伴节点B
 */
public class ParterB extends Handler {
    @Override
    public void handlerMessage(String message) {
        if ("B".equals(message)){
            Log.i("info", "handlerMessage: ==++  B同学接收了信息");
        }else {
            Log.i("info", "handlerMessage: ==++  没有该同学，错误对象");
        }
    }
}
