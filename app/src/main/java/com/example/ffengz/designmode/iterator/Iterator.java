package com.example.ffengz.designmode.iterator;

/**
 * 迭代器接口
 * 提供访问、遍历元素的接口
 *
 * @author fengzhen
 * @version 1.0, 2017/2/13
 */
public interface Iterator<T> {
    /**
     * 是否还有下个元素
     */
    boolean hasNext();

    /**
     * 获取下一个元素
     */
    T next();
}
