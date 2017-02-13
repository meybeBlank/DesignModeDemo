package com.example.ffengz.designmode.prototype;

/**
 * Created by fengzhen.
 */
public abstract class Shape implements Cloneable{

    private String id;
    // 子类使用
    protected String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId(){
        return id;
    }

    /**
     * 抽象方法，具体的形状
     */
    abstract void drwa();

    /**
     * 重写克隆方法
     * 实现克隆创建
     */
    @Override
    public Object clone(){
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}


