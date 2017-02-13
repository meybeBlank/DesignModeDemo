package com.example.ffengz.designmode.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体容器类
 *
 * @author fengzhen
 * @version 1.0, 2017/2/13
 */
public class ConcreteContainer implements Container<String>{

    private List<String> strings = new ArrayList<>();

    @Override
    public void add(String obj) {
        strings.add(obj);
    }

    @Override
    public void remove(String obj) {
        strings.remove(obj);
    }

    @Override
    public Iterator getIterator() {
        return new ConcreteIterator(strings);
    }
}
