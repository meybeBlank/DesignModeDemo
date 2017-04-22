package com.example.ffengz.designmode.proxy;

import android.util.Log;

/**
 * 真正的上网节接口,实现上网接口
 *
 * @author fengzhen
 * @version version, 2017/3/30
 */
public class RealSurfing implements Surfing{
    @Override
    public void surfing() {
        Log.i("info", "surfing: == 真的在上网");
    }
}
