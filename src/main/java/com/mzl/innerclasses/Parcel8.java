package com.mzl.innerclasses;

/**
 * @ClassName： Parcel8
 * @Description： 一个匿名类，它扩展了没有默认构造器的类
 * @author：lhg
 * @data：2020/11/18 17:52
 * @Version：1.0
 * 调用基类构造函数
 * [1] 将合适的参数传递给基类的构造器。
 * [2] 在匿名内部类末尾的分号，并不是用来标记此内部类结束的。实际上，它标记的是表达式的结束，只不过这个表达式正巧包含了匿名内部类罢了。因此，这与别的地方使用的分号是一致的。
 **/
public class Parcel8 {
    public Wrapping wrapping(int x) {
        // 基本构造函数调用
        // 在这个匿名内部类中，使用了默认的构造器来生成 Contents。
        return new Wrapping(x) { // [1]
            @Override
            public int value() {
                return super.value() * 47;
            }
        }; // [2]
    }
    public static void main(String[] args) {
        Parcel8 p = new Parcel8();
        Wrapping w = p.wrapping(10);
    }
}
