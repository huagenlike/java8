package com.mzl.collections;

import java.util.ArrayList;

/**
 * @ClassName： ApplesAndOrangesWithGenerics
 * @Description：
 * @author：lhg
 * @data：2020/12/3 16:30
 * @Version：1.0
 **/
public class ApplesAndOrangesWithGenerics {
    public static void main(String[] args) {
        // 使用预先定义的泛型类却相当简单
        // 例如定义一个用于保存 Apple 对象的 ArrayList
        ArrayList<Apple> apples = new ArrayList<>();
        for(int i = 0; i < 3; i++)
            apples.add(new Apple());
        // Compile-time error:
        // apples.add(new Orange());
        for(Apple apple : apples) {
            System.out.println(apple.id());
        }
    }
}
