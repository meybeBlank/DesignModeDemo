package com.example.ffengz.designmode.composite;

/**
 * 组合模式 抽象元素节点
 *
 * @author fengzhen
 * @version 1.0, 2017/5/22
 */
public abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    /**
     * 添加子节点
     *
     * @author fengzhen
     * @version 1.0, 2017/5/22 14:29
     */
    public abstract boolean addChild(Component child);

    /**
     * 删除子节点
     *
     * @author fengzhen
     * @version 1.0, 2017/5/22 14:29
     */
    public abstract boolean removeChild(Component child);

    /**
     * 获取子节点
     *
     * @author fengzhen
     * @version 1.0, 2017/5/22 14:29
     */
    public abstract Component getChild(int index);

    /**
     * 节点完成事件
     *
     * @author fengzhen
     * @version 1.0, 2017/5/22 14:29
     */
    public abstract void execute();

}
