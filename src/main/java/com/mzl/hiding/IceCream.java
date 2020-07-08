package com.mzl.hiding;

/**
 * @description:
 * @author: lhg
 * @date: Created in 2020/7/8 11:24
 * @version:
 * @modified By:
 */
class Sundae {
    private Sundae() {}
    static Sundae makeASundae() {
        return new Sundae();
    }
}

public class IceCream {
    public static void main(String[] args) {
        // 无参构造器为私有的，类以外的其他类不允许调用
        // 你无法通过构造器创建一个 Sundae 对象，而必须调用 makeASundae() 方法创建对象。
        //- Sundae x = new Sundae();
        Sundae x = Sundae.makeASundae();
    }
}