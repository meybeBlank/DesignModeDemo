package com.example.ffengz.designmode.abstructFactory;

import android.util.Log;

/**
 * 具体图形类
 */
public class CircleShape implements Shape {
    @Override
    public void draw() {
        Log.i("info", "draw: ==++  圆");
    }
}
