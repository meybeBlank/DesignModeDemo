package com.example.ffengz.designmode.abstructFactory;

import android.util.Log;

/**
 * 具体颜色类
 */
public class RedColor implements Color{
    @Override
    public void paint() {
        Log.i("info", "paint: ==++  红色");
    }
}
