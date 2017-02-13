package com.example.ffengz.designmode.command;

import android.util.Log;

/**
 * Created by ffengz.
 *
 * 具体的操作行为  请求类
 */
public class Operator {

    /**
     * 开启操作
     */
    public void turnOn(){
        Log.i("info", "trunOn: ==++ 开启" );
    }

    /**
     * 关闭操作
     */
    public void turnOff(){
        Log.i("info", "turnOff: ==++ 关闭");
    }
}
