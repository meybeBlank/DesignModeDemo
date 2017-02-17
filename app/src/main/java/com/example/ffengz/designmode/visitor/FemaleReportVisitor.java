package com.example.ffengz.designmode.visitor;

import android.util.Log;

/**
 * 女性访问者
 * 只需要男性的信息，不需要其他女性信息
 *
 * @author fengzhen
 * @version 1.0, 2017/2/16
 */
public class FemaleReportVisitor implements ReportVisitor{
    @Override
    public void visit(MaleStaff male) {
        Log.i("info", "FemaleReportVisitor: ==++ " + male.getName() + male.getAge());
    }

    @Override
    public void visit(FemaleStaff female) {
        Log.i("info", "FemaleReportVisitor: ==++ 不需要 " + female.getName());
    }
}
