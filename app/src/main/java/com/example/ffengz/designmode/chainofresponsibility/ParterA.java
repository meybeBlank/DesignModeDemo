package com.example.ffengz.designmode.chainofresponsibility;

import android.util.Log;

/**
 * Created by ffengz.
 *
 * 伙伴节点A
 */
public class ParterA extends Handler {
    @Override
    public void handlerMessage(String message) {
        // 如果是 A 的信息，A同学处理
        if ("A".equals(message)){
            Log.i("info", "handlerMessage: ==++  A同学接收到了信息");
        } else { // 不是A的信息，传递给下一个
            mNextHandler.handlerMessage(message);
        }
    }
}
