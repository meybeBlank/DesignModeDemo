package com.example.ffengz.designmode.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 团队人员信息
 * 创建具体的相亲团队集合
 *
 * @author fengzhen
 * @version 1.0, 2017/2/16
 */
public class Team {
    private List<StaffElement> staffs = new ArrayList<>();

    public Team() {
        staffs.add(new FemaleStaff("小美",21));
        staffs.add(new MaleStaff("小明",25));
        staffs.add(new FemaleStaff("小华",25));
        staffs.add(new MaleStaff("老王",42));
        staffs.add(new FemaleStaff("小丽",23));
        staffs.add(new MaleStaff("小张",22));
    }

    /**
     * 根据访问者，批量处理信息
     * @param visitor 访问者
     */
    public void getInfo(ReportVisitor visitor){
        for (StaffElement staff :
                staffs) {
            staff.accept(visitor);
        }
    }
}
