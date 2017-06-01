package com.example.ffengz.designmode.bridge;

/**
 * 基金抽象类
 *
 * @author fengzhen
 * @version 1.0, 2017/6/1
 */
public abstract class Fund {
    // 依赖接口
    protected Money mMoney;

    public Fund(Money mMoney) {
        this.mMoney = mMoney;
    }

    /**
     * 基本信息
     */
    public abstract void info();
}
