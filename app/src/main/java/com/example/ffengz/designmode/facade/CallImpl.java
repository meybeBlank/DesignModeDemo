package com.example.ffengz.designmode.facade;

import android.util.Log;

/**
 * 电话的具体实现
 *
 * @author fengzhen
 * @version 1.0, 2017/5/31
 */
public class CallImpl implements Call{
    @Override
    public void callTo(String mobile) {
        Log.i("info", "callTo: ==++打电话给" + mobile );
    }
}
