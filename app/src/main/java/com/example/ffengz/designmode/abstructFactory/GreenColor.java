package com.example.ffengz.designmode.abstructFactory;

import android.util.Log;

/**
 * 颜色实现类
 */
public class GreenColor implements Color {
    @Override
    public void paint() {
        Log.i("info", "paint: ==++  绿色" );
    }
}
