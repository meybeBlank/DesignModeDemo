package com.example.ffengz.designmode.state;

/**
 * Created by ffengz.
 *
 * 登录状态容器
 */
public class LoginStateContext implements LoginState{

    private static final LoginStateContext mInstance = new LoginStateContext();

    // 单例
    public static final LoginStateContext getInstance(){
        return mInstance;
    }

    private LoginStateContext(){}

    // 当前状态 默认为未登录
    private LoginState mLoginState = new OffLoginState();

    @Override
    public String transpond() {
        return mLoginState.transpond();
    }

    @Override
    public String share() {
        return mLoginState.share();
    }

    /**
     * 更改状态 同时更改行为
     * @param state 更改后状态
     */
    public void setState(LoginState state){
        mLoginState = state;
    }
}
