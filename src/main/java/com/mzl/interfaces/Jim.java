package com.mzl.interfaces;

/**
 * @ClassName： Jim
 * @Description： 多继承
 * @author：lhg
 * @data：2020/11/17 11:56
 * @Version：1.0
 * 实现多个接口时，若方法名，参数都一致，则实现时需要覆写该方法，否则会报错
 **/
interface Jim1 {
    default void jim() {
        System.out.println("Jim1::jim");
    }
}

interface Jim2 {
    default void jim() {
        System.out.println("Jim2::jim");
    }
}

// 解决这个问题，需要覆写冲突的方法
public class Jim implements Jim1, Jim2 {
    @Override
    public void jim() {
        Jim2.super.jim();
    }

    public static void main(String[] args) {
        new Jim().jim();
    }
}
