package com.example.ffengz.designmode.visitor;

/**
 * 员工元素抽象类
 *
 * @author fengzhen
 * @version 1.0, 2017/2/16
 */
public abstract class StaffElement {
    private String name;
    private int age;

    public StaffElement(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // 访问接收接口，子类具体实现不同的访问
    public abstract void accept(ReportVisitor visitor);
}
