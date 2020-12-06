package com.mzl.innerclasses;

/**
 * @ClassName： Parcel2
 * @Description： 创建内部类
 * @author：lhg
 * @data：2020/11/18 15:39
 * @Version：1.0
 **/
public class Parcel2 {
    class Contents {
        private int i = 11;

        public int value() { return i; }
    }

    class Destination {
        private String label;

        Destination(String whereTo) {
            label = whereTo;
        }

        String readLabel() { return label; }
    }

    public Destination to(String s) {
        return new Destination(s);
    }

    public Contents contents() {
        return new Contents();
    }

    public void ship(String dest) {
        Contents c = contents();
        Destination d = to(dest);
        System.out.println(d.readLabel());
    }

    public static void main(String[] args) {
        Parcel2 p = new Parcel2();
        p.ship("Tasmania");
        Parcel2 q = new Parcel2();
        // 定义对内部类的引用:
        Parcel2.Contents c = q.contents();
        Parcel2.Destination d = q.to("Borneo");
    }
}
