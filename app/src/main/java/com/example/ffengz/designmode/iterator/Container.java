package com.example.ffengz.designmode.iterator;

/**
 * 容器类接口
 * 提供获取迭代器接口
 *
 * @author fengzhen
 * @version 1.0, 2017/2/13
 */
public interface Container<T> {

    void add(T obj);

    void remove(T obj);

    /**
     * 返回迭代器对象
     */
    Iterator getIterator();
}
