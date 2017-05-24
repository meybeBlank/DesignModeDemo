package com.example.ffengz.designmode.decorator;

/**
 * 装饰照片类型  将照片放入了相册
 *
 * @author fengzhen
 * @version 1.0, 2017/5/24
 */
public class AlbumPhotos extends PhotoDecorator {
    /**
     * 构造方法传入持有的被装饰的对象
     *
     * @param photo 被装饰对象
     */
    public AlbumPhotos(Photos photo) {
        super(photo);
    }

    @Override
    public String getPhoto() {
        return "放入相册的" + super.getPhoto();
    }
}
