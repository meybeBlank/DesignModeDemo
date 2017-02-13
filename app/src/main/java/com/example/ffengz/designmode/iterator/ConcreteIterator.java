package com.example.ffengz.designmode.iterator;

import java.util.List;

/**
 * 具体迭代器
 *
 * @author fengzhen
 * @version 1.0, 2017/2/13
 */
public class ConcreteIterator implements Iterator{

    // 容器数据
    private List containers;

    // 当前遍历位置
    private int position = 0;

    public ConcreteIterator(List containers) {
        this.containers = containers;
    }

    @Override
    public boolean hasNext() {
        return !(containers.size() <= position);
    }

    @Override
    public Object next() {
        if (hasNext()){
            return containers.get(position++);
        }
        return null;
    }
}
