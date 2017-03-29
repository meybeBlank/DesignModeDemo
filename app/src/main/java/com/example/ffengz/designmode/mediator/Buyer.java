package com.example.ffengz.designmode.mediator;

/**
 * 抽象买家
 *
 * @author fengzhen
 * @version 1.0, 2017/3/29
 */
public abstract class Buyer {
    // 委托的中介
    protected Mediator mMediator;

    /**
     * 绑定中介者
     */
    public Buyer(Mediator mediator) {
        this.mMediator = mediator;
    }

    /**
     * 买房
     */
    abstract void buyHouse();

    /**
     * 得到房产证
     */
    abstract void getHouse();
}
