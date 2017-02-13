package com.example.ffengz.designmode.abstructFactory;

/**
 * 工厂抽象类
 */
public abstract class AbstractFactory {
    /**
     * 创建形状
     */
    public abstract Shape createShape();

    /**
     * 创建颜色
     */
    public abstract Color createColor();
}
