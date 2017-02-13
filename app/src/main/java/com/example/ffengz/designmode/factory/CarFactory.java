package com.example.ffengz.designmode.factory;

/**
 * Created by fengzhen.
 */
public class CarFactory {

    /**
     * 创建方法
     * @param <T> 汽车泛型
     */
    public <T extends Car>  T createCar(Class<T> clz){
        T car = null;
        try {
            car = (T) Class.forName(clz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return car;
    }

    /**
     * 创建奥迪汽车接口
     */
    public AodiCar createAodiCar(){
        return  new AodiCar();
    }
}
