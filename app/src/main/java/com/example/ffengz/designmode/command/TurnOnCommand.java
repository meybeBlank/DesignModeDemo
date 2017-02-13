package com.example.ffengz.designmode.command;

/**
 * Created by ffengz.
 *
 * 命令实体类 开启动作
 */
public class TurnOnCommand implements Command {

    private Operator mInvoker;

    public TurnOnCommand(Operator invoker) {
        this.mInvoker = invoker;
    }

    @Override
    public void execute() {
        mInvoker.turnOn();
    }
}
