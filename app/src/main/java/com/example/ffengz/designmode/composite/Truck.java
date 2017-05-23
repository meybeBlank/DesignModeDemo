package com.example.ffengz.designmode.composite;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * 根和枝干节点的具体实现
 *
 * @author fengzhen
 * @version 1.0, 2017/5/22
 */
public class Truck extends Component{
    // 存储子节点集合
    private List<Component> components = new ArrayList<>();

    public Truck(String name) {
        super(name);
    }

    @Override
    public boolean addChild(Component child) {
        components.add(child);
        return true;
    }

    @Override
    public boolean removeChild(Component child) {
        components.remove(child);
        return true;
    }

    @Override
    public Component getChild(int index) {
        return components.get(index);
    }

    @Override
    public void execute() {
        Log.i("info", "execute: ==" + name);
    }
}
