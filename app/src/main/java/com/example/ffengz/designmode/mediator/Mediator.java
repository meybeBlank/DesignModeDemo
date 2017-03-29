package com.example.ffengz.designmode.mediator;

import android.util.Log;

/**
 * 抽象中介者
 *
 * @author fengzhen
 * @version 1.0, 2017/3/29
 */
public class Mediator {
    private Buyer mBuyer;
    private Seller mSeller;
    private Bank mBank;

    public void setmBuyer(Buyer mBuyer) {
        this.mBuyer = mBuyer;
    }

    public void setmSeller(Seller mSeller) {
        this.mSeller = mSeller;
    }

    public void setmBank(Bank mBank) {
        this.mBank = mBank;
    }

    public void change(Bank bank){
        mSeller.getMoney();
        mSeller.giveHouse();
    }

    public void change(Buyer buyer){
        mBank.lending();
    }

    public void change(Seller seller){
        mBuyer.getHouse();
        mBank.getMonthlyMoney();
    }
}
