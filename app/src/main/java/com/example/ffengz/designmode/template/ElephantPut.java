package com.example.ffengz.designmode.template;

import android.util.Log;

/**
 * 把大象放入冰箱
 *
 * @author fengzhen
 * @version 1.0, 2017/2/14
 */
public class ElephantPut extends Template{
    @Override
    void openIcebox() {
        Log.i("info", "openIcebox: ==++打开冰箱！");
    }

    @Override
    void putIn() {
        Log.i("info", "putIn: ==++放入大象！");
    }

    @Override
    void closeIcebox() {
        Log.i("info", "closeIcebox: ==++关上冰箱！");
    }

    @Override
    void action() {
        Log.i("info", "action: ==++哈哈哈！！！");
    }
}
