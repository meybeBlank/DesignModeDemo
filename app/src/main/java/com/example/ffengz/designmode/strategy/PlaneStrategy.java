package com.example.ffengz.designmode.strategy;

/**
 * Created by ffengz.
 *
 * 飞机回家策略
 */
public class PlaneStrategy implements GoHomeStrategy {
    @Override
    public String goHome() {
        return "飞机回家 花费 300元";
    }
}
