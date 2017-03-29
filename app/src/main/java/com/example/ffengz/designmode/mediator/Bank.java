package com.example.ffengz.designmode.mediator;

/**
 * 抽象银行
 * 这里假设银行与客户也不直接交互，不等同于现实情况
 *
 * @author fengzhen
 * @version 1.0, 2017/3/29
 */
public abstract class Bank {
    // 委托的中介
    protected Mediator mMediator;

    /**
     * 绑定中介者
     */
    public Bank(Mediator mediator) {
        this.mMediator = mediator;
    }

    /**
     * 贷款
     */
    abstract void lending();

    /**
     * 获取月供
     */
    abstract void getMonthlyMoney();
}
