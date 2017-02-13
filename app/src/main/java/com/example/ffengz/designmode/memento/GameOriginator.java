package com.example.ffengz.designmode.memento;

/**
 * 游戏类
 * 备忘发起者,包含储存、恢复方法
 *
 * @author fengzhen
 * @version 1.0, 2017/2/10
 */
public class GameOriginator {
    // 生命值
    private int healthPoint = 100;
    // 魔法值
    private int magicPoint = 100;
    // 关卡
    private int round = 1;

    /**
     * 进行游戏状态改变
     */
    public void play(){
        healthPoint = 56;
        magicPoint = 88;
        round = 3;
    }

    /**
     * 创建备忘录，开始存储
     */
    public GameMemento createMememto(){
        return new GameMemento(healthPoint, magicPoint, round);
    }

    /**
     * 恢复存档
     * @param memento 保存的存档
     */
    public void restore(GameMemento memento){
        healthPoint = memento.getHealthPoint();
        magicPoint = memento.getMagicPoint();
        round = memento.getRound();
    }

    @Override
    public String toString() {
        return "GameOriginator{" +
                "healthPoint=" + healthPoint +
                ", magicPoint=" + magicPoint +
                ", round=" + round +
                '}';
    }
}
