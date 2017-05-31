package com.example.ffengz.designmode.facade;

import android.util.Log;

/**
 * 相机实现
 *
 * @author fengzhen
 * @version 1.0, 2017/5/31
 */
public class CameraImpl implements Camera{
    @Override
    public void takePhotos() {
        Log.i("info", "takePhotos: ==++拍照");
    }
}
