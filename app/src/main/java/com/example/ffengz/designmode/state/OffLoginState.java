package com.example.ffengz.designmode.state;

/**
 * Created by ffengz.
 *
 * 未登录状态
 */
public class OffLoginState implements LoginState {
    @Override
    public String transpond() {
        return gotoLogin();
    }

    @Override
    public String share() {
        return gotoLogin();
    }

    private String gotoLogin(){
        return "未登录  跳转登录!";
    }
}
