package com.example.ffengz.designmode.strategy;

/**
 * Created by ffengz.
 *
 * 火车回家策略
 */
public class SubwayStrategy implements GoHomeStrategy{
    @Override
    public String goHome() {
        return "火车回家  花费 100元";
    }
}
