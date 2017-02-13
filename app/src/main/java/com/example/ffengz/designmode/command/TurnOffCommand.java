package com.example.ffengz.designmode.command;

/**
 * Created by ffengz.
 *
 * 命令实体类 关闭动作
 */
public class TurnOffCommand implements Command {

    private Operator mInvoker;

    public TurnOffCommand(Operator invoker) {
        this.mInvoker = invoker;
    }

    @Override
    public void execute() {
        mInvoker.turnOff();
    }
}
