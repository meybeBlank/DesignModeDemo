package com.example.ffengz.designmode.prototype;

import android.util.Log;

/**
 * Created by fengzhen.
 */

public class Rectangle extends Shape {
    public Rectangle() {
        type = "方形";
    }

    @Override
    void drwa() {
        Log.i("info", "drwa: ==++ 方形");
    }

}
