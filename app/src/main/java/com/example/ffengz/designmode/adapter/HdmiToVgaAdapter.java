package com.example.ffengz.designmode.adapter;

/**
 * HDMI转VGA适配器
 *
 * @author fengzhen
 * @version 1.0, 2017/5/23
 */
public class HdmiToVgaAdapter extends GTX10 implements VGA{
    private GTX10 mGTX10;

    public HdmiToVgaAdapter(GTX10 mGTX10) {
        this.mGTX10 = mGTX10;
    }

    @Override
    public String needVGA() {
        // 经过一系列复杂过程
        return "VGA";
    }
}
