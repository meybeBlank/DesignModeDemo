package com.example.ffengz.designmode.flyweight;

import android.util.Log;

import java.util.Random;

/**
 * 火车票对象
 *
 * @author fengzhen
 * @version 1.0, 2017/5/25
 */
public class TrainTicket implements Ticket{
    private String from;
    private String to;
    private int site;

    public TrainTicket(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void showSite() {
        site = new Random().nextInt(100);
        Log.i("info", "showSite: ==++从" + from + "到" + to + "座位号：" + site + "的车票");
    }
}
