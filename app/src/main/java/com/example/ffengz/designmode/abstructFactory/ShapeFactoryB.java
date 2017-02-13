package com.example.ffengz.designmode.abstructFactory;

/**
 * 具体工厂类 创建绿色的方形
 */
public class ShapeFactoryB extends AbstractFactory{
    @Override
    public Shape createShape() {
        return new RectangleShape();
    }

    @Override
    public Color createColor() {
        return new GreenColor();
    }
}
