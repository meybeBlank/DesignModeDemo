package com.example.ffengz.designmode.proxy;

import android.util.Log;

/**
 * 代理上网者  实现上网接口
 * 拥有真实对象的引用，进行操作
 *
 * @author fengzhen
 * @version version, 2017/3/30
 */
public class ProxySurfing implements Surfing {
    private Surfing mRealSurfing;

    /**
     * 绑定真实的上网者
     */
    public ProxySurfing(Surfing mRealSurfing) {
        this.mRealSurfing = mRealSurfing;
    }

    @Override
    public void surfing() {
        Log.i("info", "surfing: == 代理上网处理中...");
        mRealSurfing.surfing();
    }
}
