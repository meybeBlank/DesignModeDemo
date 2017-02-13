package com.example.ffengz.designmode.interpreter;

/**
 * Created by ffengz.
 *
 * 加法符号解释器 "+"
 */
public class AddOperatorExpression extends OperatorExpression {

    public AddOperatorExpression(Expression num1, Expression num2) {
        super(num1, num2);
    }

    @Override
    public int interpret(int context) {
        // 分别调用解释器进行解释
        return num1.interpret(context) + num2.interpret(context);
    }
}
