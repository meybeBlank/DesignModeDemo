package com.example.ffengz.designmode.interpreter;

/**
 * Created by ffengz.
 *
 * 符号抽象解释器
 * 提取运算符号解释器的共性
 */
public abstract class OperatorExpression extends Expression {
    // 运算需要的数字解释器
    protected Expression num1,num2;

    public OperatorExpression(Expression num1, Expression num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
}
