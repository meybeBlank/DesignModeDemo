package com.example.ffengz.designmode.mediator;

import android.util.Log;

/**
 * 李四 卖房者
 *
 * @author fengzhen
 * @version 1.0, 2017/3/29
 */
public class L4Seller extends Seller{
    /**
     * 绑定中介者
     *
     * @param mediator
     */
    public L4Seller(Mediator mediator) {
        super(mediator);
    }

    @Override
    void getMoney() {
        Log.i("info", "buyHouse: 李四获得全款");
    }

    @Override
    void giveHouse() {
        Log.i("info", "buyHouse: 李四交出房子");
        mMediator.change(this);
    }
}
