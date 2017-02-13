package com.example.ffengz.designmode.observer;

/**
 * 具体主题
 * 通知更新
 *
 * @author fengzhen
 * @version 1.0, 2017/2/9
 */
public class ConcreteSubject extends Subject {
    @Override
    public void notifyObservers(String context) {
        for (Observer o :
                observers) {
            o.update(context);
        }
    }
}
