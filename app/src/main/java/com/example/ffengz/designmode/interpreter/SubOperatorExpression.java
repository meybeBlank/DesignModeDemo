package com.example.ffengz.designmode.interpreter;

/**
 * Created by ffengz..
 *
 * 减法符号解释器 "-"
 */
public class SubOperatorExpression extends OperatorExpression {

    public SubOperatorExpression(Expression num1, Expression num2) {
        super(num1, num2);
    }

    @Override
    public int interpret(int context) {
        return num1.interpret(context) - num2.interpret(context);
    }
}
