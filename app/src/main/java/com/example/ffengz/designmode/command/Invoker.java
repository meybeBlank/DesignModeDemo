package com.example.ffengz.designmode.command;

/**
 * Created by ffengz.
 *
 * 命令调用者  封装命令
 */
public class Invoker {
    private TurnOffCommand mTurnOff;
    private TurnOnCommand mTurnON;

    /**
     * 设置开启命令
     * @param command 开启命令
     */
    public void setTurnOnCommand(TurnOnCommand command){
        this.mTurnON = command;
    }

    /**
     * 设置关闭命令
     * @param command 关闭命令
     */
    public void setTurnOffCommand(TurnOffCommand command){
        this.mTurnOff = command;
    }

    /**
     * 执行开启命令
     */
    public void turnOn(){
        mTurnON.execute();
    }

    public void turnOff(){
        mTurnOff.execute();
    }
}
