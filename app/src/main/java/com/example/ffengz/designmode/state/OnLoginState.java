package com.example.ffengz.designmode.state;

/**
 * Created by ffengz.
 *
 * 登录状态
 */
public class OnLoginState implements LoginState {
    @Override
    public String transpond() {
        return "登陆了  转发！";
    }

    @Override
    public String share() {
        return "登陆了  分享";
    }
}
