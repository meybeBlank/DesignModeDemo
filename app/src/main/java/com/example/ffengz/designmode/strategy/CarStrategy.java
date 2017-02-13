package com.example.ffengz.designmode.strategy;

/**
 * Created by ffengz.
 *
 * 汽车回家策略
 */
public class CarStrategy implements GoHomeStrategy{
    @Override
    public String goHome() {
        return "汽车回家  花费  150元";
    }
}
