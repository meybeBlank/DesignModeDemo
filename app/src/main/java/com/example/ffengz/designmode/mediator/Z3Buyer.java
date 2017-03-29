package com.example.ffengz.designmode.mediator;

import android.util.Log;

/**
 * 张三买房者
 *
 * @author fengzhen
 * @version 1.0, 2017/3/29
 */
public class Z3Buyer extends Buyer{
    /**
     * 绑定中介者
     *
     * @param mediator
     */
    public Z3Buyer(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void buyHouse() {
        Log.i("info", "buyHouse: 张三买房");
        Log.i("info", "buyHouse: 张三给首付");
        mMediator.change(this);
    }

    @Override
    void getHouse() {
        Log.i("info", "buyHouse: 张三获得房子");
        Log.i("info", "buyHouse: 张三给房贷");
    }
}
