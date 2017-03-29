package com.example.ffengz.designmode.mediator;

/**
 * 抽象卖家
 *
 * @author fengzhen
 * @version 1.0, 2017/3/29
 */
public abstract class Seller {
    // 委托的中介
    protected Mediator mMediator;

    /**
     * 绑定中介者
     */
    public Seller(Mediator mediator) {
        this.mMediator = mediator;
    }

    /**
     * 收钱
     */
    abstract void getMoney();

    /**
     * 付出房产证
     */
    abstract void giveHouse();
}
