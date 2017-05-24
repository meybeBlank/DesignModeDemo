package com.example.ffengz.designmode.decorator;

/**
 * 自拍照  继承自照片
 *
 * @author fengzhen
 * @version 1.0, 2017/5/24
 */
public class Selfie extends Photos {
    private String name;

    public Selfie(String name) {
        this.name = name;
    }

    @Override
    public String getPhoto() {
        return name;
    }
}
