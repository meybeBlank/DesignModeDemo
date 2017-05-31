package com.example.ffengz.designmode.facade;

/**
 * 外观类
 * 继承电话、相机等功能，提供统一访问
 *
 * @author fengzhen
 * @version 1.0, 2017/5/31
 */
public class Phone {
    private Call mCall;
    private Camera mCamera;

    /**
     * 创建外观类，默认创建一个型号的手机，一个型号的相机
     */
    public Phone() {
        this.mCall = new CallImpl();
        this.mCamera = new CameraImpl();
    }

    /**
     * 提供接口拨打电话
     */
    public void callTo(String mobile){
        mCall.callTo(mobile);
    }

    /**
     * 提供接口访问相机
     */
    public void takePhotos(){
        mCamera.takePhotos();
    }
}
