package com.mzl.innerclasses;

/**
 * @ClassName： TestParcel
 * @Description： 内部类与向上转型
 * @author：lhg
 * @data：2020/11/18 16:58
 * @Version：1.0
 **/
class Parcel4 {
    // 内部类 PContents 是 private，所以除了 Parcel4，没有人能访问它。
    // 普通（非内部）类的访问权限不能被设为 private 或者 protected；他们只能设置为 public 或 package 访问权限。
    private class PContents implements Contents {
        private int i = 11;
        @Override
        public int value() { return i; }
    }
    // PDestination 是 protected，所以只有 Parcel4 及其子类、还有与 Parcel4 同一个包中的类（因为 protected 也给予了包访问权）能访问 PDestination，其他类都不能访问 PDestination，这意味着，如果客户端程序员想了解或访问这些成员，那是要受到限制的。
    protected final class PDestination implements Destination {
        private String label;
        private PDestination(String whereTo) {
            label = whereTo;
        }
        @Override
        public String readLabel() { return label; }
    }
    public Destination destination(String s) {
        return new PDestination(s);
    }
    public Contents contents() {
        return new PContents();
    }
}
public class TestParcel {
    public static void main(String[] args) {
        Parcel4 p = new Parcel4();
        Contents c = p.contents();
        Destination d = p.destination("Tasmania");
        // 非法 -- 无法创建私人类：
        // 'com.mzl.innerclasses.Parcel4.PContents在“ com.mzl.innerclasses.Parcel4”中具有私有访问权限
        // Parcel4.PContents pc = p.new PContents();
        // 'PDestination（java.lang.String）'在'com.mzl.innerclasses.Parcel4.PDestination'中具有私有访问权限
        // Parcel4.PDestination pd = p.new PDestination();
    }
}
