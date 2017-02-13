package com.example.ffengz.designmode.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * 备忘录托管者
 * 对备忘录进行存储管理
 *
 * @author fengzhen
 * @version 1.0, 2017/2/10
 */
public class Caretaker {
    private List<GameMemento> mementos = new ArrayList<>();

    /**
     * 加入新的备忘录
     *
     * @param memento 新的备忘录
     */
    public void add(GameMemento memento) {
        mementos.add(memento);
    }

    /**
     * 获取备忘录
     *
     * @param index 索引，倒叙
     * @return 索引对应的备忘录
     */
    public GameMemento getMemento(int index) {
        // 前一个状态
        int i = mementos.size() - index;
        if (i >= 1 && i <= mementos.size()) {
            return mementos.get(i-1);
        }
        return null;
    }
}
