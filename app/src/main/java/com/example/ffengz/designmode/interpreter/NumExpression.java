package com.example.ffengz.designmode.interpreter;

/**
 * Created by ffengz.
 *
 * 数字解释器  只解析数字
 */
public class NumExpression extends Expression {
    // 待解析的 数字
    private int num;

    public NumExpression(int num) {
        this.num = num;
    }

    @Override
    public int interpret(int context) {
        return num;
    }
}
