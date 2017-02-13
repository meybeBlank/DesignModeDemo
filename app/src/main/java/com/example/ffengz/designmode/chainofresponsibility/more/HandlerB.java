package com.example.ffengz.designmode.chainofresponsibility.more;

import android.util.Log;

/**
 * Created by ffengz.
 */

public class HandlerB extends Handler {
    @Override
    public String getHandlerName() {
        return "B";
    }

    @Override
    public void handleMessage(String message) {
        Log.i("info", "handMessage: ==++  B接收了信息   " + message);
    }
}
