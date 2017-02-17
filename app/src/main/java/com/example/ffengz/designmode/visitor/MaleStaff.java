package com.example.ffengz.designmode.visitor;

/**
 * 男性员工，统计年龄
 *
 * @author fengzhen
 * @version 1.0, 2017/2/16
 */
public class MaleStaff extends StaffElement{
    public MaleStaff(String name, int age) {
        super(name, age);
    }

    @Override
    public void accept(ReportVisitor visitor) {
        visitor.visit(this);
    }
}
