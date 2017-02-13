package com.example.ffengz.designmode.strategy;

/**
 * Created by ffengz.
 *
 * 回家策略集合封装容器类
 */
public class GoHomeContext {
    private GoHomeStrategy strategy;

    /**
     * 策略选择
     */
    public void setStrategy(GoHomeStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 执行该策略
     */
    public String goHomeBySubway(){
        return strategy.goHome();
    }
}
