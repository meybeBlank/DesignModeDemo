package com.example.ffengz.designmode.visitor;

/**
 * 女性员工，年龄未知。
 *
 * @author fengzhen
 * @version 1.0, 2017/2/16
 */
public class FemaleStaff extends StaffElement{
    public FemaleStaff(String name, int age) {
        super(name, age);
    }

    @Override
    public void accept(ReportVisitor visitor) {
        visitor.visit(this);
    }
}
