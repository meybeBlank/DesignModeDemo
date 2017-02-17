package com.example.ffengz.designmode.template;

/**
 * 模版抽象类
 * 定义具体的流程方法，final的流程执行方法
 *
 * @author fengzhen
 * @version 1.0, 2017/2/14
 */
public abstract class Template {
    /**
     * 打开冰箱
     */
    abstract void openIcebox();

    /**
     * 放入大象
     */
    abstract void putIn();

    /**
     * 关上冰箱
     */
    abstract void closeIcebox();

    /**
     * 动作
     */
    abstract void action();

    /**
     * 顺序执行动作，final禁止修改流程
     */
    public final void putInSomething(){
        openIcebox();
        putIn();
        closeIcebox();
        action();
    }
}
