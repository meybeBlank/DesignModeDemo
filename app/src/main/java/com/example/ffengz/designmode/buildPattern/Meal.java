package com.example.ffengz.designmode.buildPattern;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fengzhen.
 *
 * 一份套餐
 */
public class Meal {
    // 一份套餐
    private List<Food> aMeal = new ArrayList<>();

    /**
     * 私有化构造方法,隐藏内部实现
     */
    private Meal(){}

    /**
     * 隐藏配制方法
     * 加菜
     */
    private void addFood(Food food){
        aMeal.add(food);
    }

    /**
     * 展示Meal
     */
    public void showFoods(){
        for (int i = 0; i < aMeal.size(); i++) {
            System.out.print(aMeal.get(i).getName() + "   包装：" + aMeal.get(i).getPackage() + "");
            Log.i("info", "showFoods: ==++" + aMeal.get(i).getName() + "   包装：" + aMeal.get(i).getPackage() + "");
        }
    }

    /**
     * 内部类 进行创建 同时封装内部实现
     */
    public static class MealBuild{

        List<Food> aMeal = new ArrayList<>();

        /**
         * 暴露设置方法
         */
        public MealBuild add(Food food){
            aMeal.add(food);
            return this;
        }

        /**
         * 暴露方法进行创建
         */
        public Meal creat(){
            Meal meal = new Meal();
            for (Food food :
                    aMeal) {
                meal.addFood(food);
            }
            return  meal;
        }
    }
}
