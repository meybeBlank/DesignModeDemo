package com.example.ffengz.designmode.memento;

/**
 * 游戏备忘录
 * 生命、魔法、关卡 三个属性数据
 *
 * @author fengzhen
 * @version 1.0, 2017/2/10
 */
public class GameMemento {
    // 生命值
    private int healthPoint;
    // 魔法值
    private int magicPoint;
    // 关卡
    private int round;

    public GameMemento(int healthPoint, int magicPoint, int round) {
        this.healthPoint = healthPoint;
        this.magicPoint = magicPoint;
        this.round = round;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public int getMagicPoint() {
        return magicPoint;
    }

    public void setMagicPoint(int magicPoint) {
        this.magicPoint = magicPoint;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }
}
