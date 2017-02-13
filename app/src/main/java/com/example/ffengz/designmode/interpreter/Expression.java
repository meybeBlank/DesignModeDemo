package com.example.ffengz.designmode.interpreter;

/**
 * Created by ffengz.
 *
 * 抽象算术运算解析器
 * 提取所有解析器的共性
 */
public abstract class Expression {
    /**
     * 抽象的 解析方法
     * context 这里没有用处  解释器之外的全局信息
     * @return 解析获得的值
     */
    public abstract int interpret(int context);
}
