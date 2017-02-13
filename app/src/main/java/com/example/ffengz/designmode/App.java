package com.example.ffengz.designmode;

import android.app.Application;

import com.networkbench.agent.impl.NBSAppAgent;

/**
 * Created by ffengz.
 */
public class App extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        // 多进程线程需求
//        NBSAppAgent.setLicenseKey("99bf7fe0c53f496e87dc03e163f85dc6").withLocationServiceEnabled(true).startInApplication(this.getApplicationContext());
//        NBSAppAgent.setLicenseKey("99bf7fe0c53f496e87dc03e163f85dc6").start(this.getApplicationContext());

    }

}
