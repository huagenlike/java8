package com.mzl.innerclasses;

/**
 * @ClassName： Parcel1
 * @Description： 创建内部类
 * @author：lhg
 * @data：2020/11/18 15:35
 * @Version：1.0
 **/
public class Parcel1 {
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
    // Using inner classes looks just like
    // using any other class, within Parcel1:
    public void ship(String dest) {
        Contents c = new Contents();
        Destination d = new Destination(dest);
        // 当我们在 ship() 方法里面使用内部类的时候，与使用普通类没什么不同。
        // 在这里，明显的区别只是内部类的名字是嵌套在 Parcel1 里面的。
        System.out.println(d.readLabel());
    }

    public static void main(String[] args) {
        Parcel1 p = new Parcel1();
        p.ship("Tasmania");
    }
}
