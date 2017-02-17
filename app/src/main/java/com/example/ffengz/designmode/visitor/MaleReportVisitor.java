package com.example.ffengz.designmode.visitor;

import android.util.Log;

/**
 * 男性访问者
 * 只需要女性信息，不需要其他男性信息
 *
 * @author fengzhen
 * @version 1.0, 2017/2/16
 */
public class MaleReportVisitor implements ReportVisitor{
    @Override
    public void visit(MaleStaff male) {
        Log.i("info", "MaleReportVisitor: ==++ 不需要 " + male.getName());
    }

    @Override
    public void visit(FemaleStaff female) {
        Log.i("info", "MaleReportVisitor: ==++ " + female.getName() + "，年龄：未知");
    }
}
