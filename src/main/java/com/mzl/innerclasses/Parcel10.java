package com.mzl.innerclasses;

/**
 * @ClassName： Parcel10
 * @Description：
 * @author：lhg
 * @data：2020/11/20 10:56
 * @Version：1.0
 * 使用“实例初始化”在匿名内部类上执行构造
 **/
public class Parcel10 {
    public Destination destination(final String dest, final float price) {
        return new Destination() {
            private int cost;
            // 每个对象的实例初始化:
            {
                cost = Math.round(price);
                if(cost > 100)
                    System.out.println("Over budget!");
            }
            private String label = dest;
            @Override
            public String readLabel() { return label; }
        };
    }
    public static void main(String[] args) {
        Parcel10 p = new Parcel10();
        Destination d = p.destination("Tasmania", 101.395F);
    }
}