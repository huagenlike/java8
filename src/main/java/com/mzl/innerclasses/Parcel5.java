package com.mzl.innerclasses;

/**
 * @ClassName： Parcel5
 * @Description： 一个定义在方法中的类
 * @author：lhg
 * @data：2020/11/18 17:11
 * @Version：1.0
 *  在方法中嵌套类
 **/
public class Parcel5 {
    public Destination destination(String s) {
        // PDestination 类是 destination() 方法的一部分，而不是 Parcel5 的一部分。
        // 所以，在 destination() 之外不能访问 PDestination，注意出现在 return 语句中的向上转型-返回的是 Destination 的引用，它是 PDestination 的基类。
        final class PDestination implements Destination {
            private String label;

            private PDestination(String whereTo) {
                label = whereTo;
            }

            @Override
            public String readLabel() { return label; }
        }
        return new PDestination(s);
    }

    public static void main(String[] args) {
        Parcel5 p = new Parcel5();
        Destination d = p.destination("Tasmania");
        System.out.println(d.readLabel());
    }
}
