package com.example.ffengz.designmode.bridge;

import android.util.Log;

/**
 * 汇丰基金定投
 *
 * @author fengzhen
 * @version 1.0, 2017/6/1
 */
public class HuiFengFund extends Fund {
    public HuiFengFund(Money mMoney) {
        super(mMoney);
    }

    @Override
    public void info() {
        Log.i("info", "info: ==++ 汇丰基金定投" + mMoney.eachMoney());
    }
}
