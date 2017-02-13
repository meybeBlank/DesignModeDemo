package com.example.ffengz.designmode.buildPattern;

/**
 * Created by fengzhen.
 *
 */
public abstract class EatFood implements Food {

    /**
     * 使用盘子盛装
     * 组建盘子
     */
    @Override
    public String getPackage() {
        return new Dish().pack();
    }

}
