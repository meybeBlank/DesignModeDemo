package com.example.ffengz.designmode.command;

import android.util.Log;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by ffengz.
 *
 * 命令调用者  封装命令 记录操作序列
 */
public class Invoker2 {
    // 命令列表
    private List<Command> commandList = Collections.synchronizedList(new ArrayList<Command>());

    /**
     * 添加新命令
     * @param command 新命令
     */
    public void add(Command command){
        commandList.add(command);
    }

    /**
     * 执行命令
     */
    public void execute(){
        if (commandList.size() > 0){
            for (Command c :
                    commandList) {
                c.execute();
            }
        }
    }

    /**
     * 记录
     */
    public void record(){
        if (commandList.size() > 0){
            for (Command c :
                    commandList) {
                if (c instanceof TurnOnCommand){
                    Log.i("info", "record: ==++ 开启动作" );
                }else if (c instanceof TurnOffCommand){
                    Log.i("info", "record: ==++ 关闭动作");
                }

            }
        }
    }
}
