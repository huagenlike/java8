package com.mzl.innerclasses;

/**
 * @ClassName： Parcel7b
 * @Description： Parcel7 是下述形式的简化形式：
 * @author：lhg
 * @data：2020/11/18 17:31
 * @Version：1.0
 * 这种奇怪的语法指的是：“创建一个继承自 Contents 的匿名类的对象。”
 * 通过 new 表达式返回的引用被自动向上转型为对 Contents 的引用。
 **/
public class Parcel7b {
    class MyContents implements Contents {
        private int i = 11;
        @Override
        public int value() { return i; }
    }

    public Contents contents() {
        return new MyContents();
    }

    public static void main(String[] args) {
        Parcel7b p = new Parcel7b();
        Contents c = p.contents();
    }
}
