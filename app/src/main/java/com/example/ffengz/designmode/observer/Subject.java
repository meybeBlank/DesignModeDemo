package com.example.ffengz.designmode.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象主题，即被观察者。
 * 将所有观察者的引用保存到集合，并提供添加、删除与通知观察者方法
 *
 * @author fengzhen
 * @version 1.0, 2017/2/9
 */
public abstract class Subject {
    // 所有观察者
    protected List<Observer> observers = new ArrayList<>();

    /**
     * 添加新的观察者
     * @param observer 新增观察者
     */
    public void attach(Observer observer){
        observers.add(observer);
    }

    /**
     * 删除绑定的观察者
     * @param observer 移除观察者
     */
    public void detach(Observer observer){
        if (observers.contains(observer)) {
            observers.remove(observer);
        }
    }

    /**
     * 通知方法，通知所有观察者
     * @param context 通知传递信息
     */
    public abstract void notifyObservers(String context);
}
