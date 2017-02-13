package com.example.ffengz.designmode.prototype;

import android.util.Log;

/**
 * Created by fengzhen.
 */

public class Circle extends Shape {

    public Circle() {
        type = "圆形";
    }

    @Override
    void drwa() {
        Log.i("info", "drwa: ==++ 圆形");
    }
}
