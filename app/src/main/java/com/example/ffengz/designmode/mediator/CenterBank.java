package com.example.ffengz.designmode.mediator;

import android.util.Log;

/**
 * 中央银行
 *
 * @author fengzhen
 * @version 1.0, 2017/3/29
 */
public class CenterBank extends Bank{
    /**
     * 绑定中介者
     *
     * @param mediator
     */
    public CenterBank(Mediator mediator) {
        super(mediator);
    }

    @Override
    void lending() {
        Log.i("info", "buyHouse: 银行放贷");
        mMediator.change(this);
    }

    @Override
    void getMonthlyMoney() {
        Log.i("info", "buyHouse: 得到月供");
    }
}
