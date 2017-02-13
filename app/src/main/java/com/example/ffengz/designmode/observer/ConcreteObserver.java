package com.example.ffengz.designmode.observer;

import android.util.Log;

/**
 * 具体观察者
 * 重写更新方法，接收通知更新自己
 *
 * @author fengzhen
 * @version 1.0, 2017/2/9
 */
public class ConcreteObserver extends Observer {
    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String context) {
        Log.i("info", "update: ==++ " + name + "接收到更新: " + context);
    }
}
