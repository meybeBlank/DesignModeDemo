package com.example.ffengz.designmode.composite;

import android.util.Log;

/**
 * 叶子节点具体实现
 *
 * @author fengzhen
 * @version 1.0, 2017/5/22
 */
public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public boolean addChild(Component child) {
        return false;
    }

    @Override
    public boolean removeChild(Component child) {
        return false;
    }

    @Override
    public Component getChild(int index) {
        return null;
    }

    @Override
    public void execute() {
        Log.i("info", "execute: == 执行叶子节点" + name);
    }
}
