package com.mzl.innerclasses;

/**
 * @ClassName： Parcel7
 * @Description： 匿名内部类
 * @author：lhg
 * @data：2020/11/18 17:20
 * @Version：1.0
 * 返回一个匿名内部类的实例
 **/
public class Parcel7 {
    public Contents contents() {
        return new Contents() { // 插入类别定义
            private int i = 11;

            @Override
            public int value() { return i; }
        }; // 需要分号
    }

    public static void main(String[] args) {
        Parcel7 p = new Parcel7();
        Contents c = p.contents();
    }
}
