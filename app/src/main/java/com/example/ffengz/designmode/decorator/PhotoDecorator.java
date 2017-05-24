package com.example.ffengz.designmode.decorator;

/**
 * 照片装饰抽象类持有Photos也继承Photos
 *
 * @author fengzhen
 * @version version, 2017/5/24
 */
public abstract class PhotoDecorator extends Photos{
    // 持有装饰对象
    private Photos photo;

    /**
     * 构造方法传入持有的被装饰的对象
     * @param photo 被装饰对象
     */
    public PhotoDecorator(Photos photo) {
        this.photo = photo;
    }

    @Override
    public String getPhoto() {
        return photo.getPhoto();
    }
}
