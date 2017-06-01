package com.example.ffengz.designmode.bridge;

import android.util.Log;

/**
 * 国泰基金定投
 *
 * @author fengzhen
 * @version 1.0, 2017/6/1
 */

public class GuoTaiFund extends Fund{
    public GuoTaiFund(Money mMoney) {
        super(mMoney);
    }

    @Override
    public void info() {
        Log.i("info", "info: ==++ 国泰基金定投" + mMoney.eachMoney());
    }
}
