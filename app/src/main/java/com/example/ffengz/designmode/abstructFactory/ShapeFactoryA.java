package com.example.ffengz.designmode.abstructFactory;

/**
 * 具体工厂，创建红色的圆
 */
public class ShapeFactoryA extends AbstractFactory {
    @Override
    public Shape createShape() {
        return new CircleShape();
    }

    @Override
    public Color createColor() {
        return new RedColor();
    }
}
