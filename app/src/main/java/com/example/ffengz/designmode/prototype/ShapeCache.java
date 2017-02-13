package com.example.ffengz.designmode.prototype;

import java.util.Hashtable;

/**
 * Created by fengzhen.
 */

public class ShapeCache {
    // 缓存图形
    private static Hashtable<String, Shape> mCache
            = new Hashtable<>();

    /**
     * 加载几个图形，模拟缓存耗时操作
     */
    public static void loadShape(){
        // 存入一个方形
        Rectangle rectangle = new Rectangle();
        rectangle.setId("1");
        mCache.put(rectangle.getId(),rectangle);

        // 存入一个圆形
        Circle circle = new Circle();
        circle.setId("2");
        mCache.put(circle.getId(),circle);
    }

    /**
     * 拷贝图形返回
     */
    public static Shape getShape(String id){
        Shape shape = mCache.get(id);
        return (Shape) shape.clone();
    }
}
