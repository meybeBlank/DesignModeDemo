package com.example.ffengz.designmode.buildPattern;

/**
 * Created by fengzhen.
 */
public abstract class DrinkFood implements Food {
    @Override
    public String getPackage() {
        return new Cup().pack();
    }
}
