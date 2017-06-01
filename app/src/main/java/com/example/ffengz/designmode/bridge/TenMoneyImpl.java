package com.example.ffengz.designmode.bridge;

/**
 * 10元定投
 *
 * @author fengzhen
 * @version 1.0, 2017/6/1
 */
public class TenMoneyImpl implements Money{
    @Override
    public String eachMoney() {
        return "10元";
    }
}
