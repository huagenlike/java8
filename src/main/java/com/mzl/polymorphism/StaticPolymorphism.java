package com.mzl.polymorphism;

/**
 * @ClassName： StaticPolymorphism
 * @Description： 陷阱：属性与静态方法
 * @author：lhg
 * @data：2020/11/16 15:38
 * @Version：1.0
 * 方法是静态(static)的，它的行为就不具有多态性
 * 静态的方法只与类关联，与单个的对象无关。
 **/
class StaticSuper {
    public static String staticGet() {
        return "Base staticGet()";
    }

    public String dynamicGet() {
        return "Base dynamicGet()";
    }
}

class StaticSub extends StaticSuper {
    public static String staticGet() {
        return "Derived staticGet()";
    }
    @Override
    public String dynamicGet() {
        return "Derived dynamicGet()";
    }
}

public class StaticPolymorphism {
    public static void main(String[] args) {
        StaticSuper sup = new StaticSub(); // Upcast
        System.out.println(StaticSuper.staticGet());
        System.out.println(sup.dynamicGet());
    }
}
