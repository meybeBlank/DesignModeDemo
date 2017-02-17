package com.example.ffengz.designmode.visitor;

/**
 * 报表访问者接口
 * 定义不同类型数据的报表方案,这里可发现此模式的缺点之一
 *
 * @author fengzhen
 * @version 1.0, 2017/2/16
 */
public interface ReportVisitor {
    // 男性访问方法
    void visit(MaleStaff male);

    // 女性访问方法
    void visit(FemaleStaff female);
}
