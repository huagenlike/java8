package com.mzl.innerclasses;

/**
 * @ClassName： Parcel3
 * @Description：
 * @author：lhg
 * @data：2020/11/18 16:10
 * @Version：1.0
 * 使用.new创建内部类的实例
 **/
public class Parcel3 {
    class Contents {
        private int i = 11;
        public int value() { return i; }
    }
    class Destination {
        private String label;
        Destination(String whereTo) { label = whereTo; }
        String readLabel() { return label; }
    }
    public static void main(String[] args) {
        Parcel3 p = new Parcel3();
        // Must use instance of outer class to create an instance of the inner class:
        Parcel3.Contents c = p.new Contents();
        Parcel3.Destination d = p.new Destination("Tasmania");
    }
}
