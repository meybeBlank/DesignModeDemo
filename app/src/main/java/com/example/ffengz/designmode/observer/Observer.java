package com.example.ffengz.designmode.observer;

/**
 * 抽象观察者
 * 定义一个更新接口，被观察者更改时通知更新自己
 *
 * @author fengzhen
 * @version 1.0, 2017/2/9
 */
public abstract class Observer {
    /**
     * 更新方法
     */
    public abstract void update(String context);
}
