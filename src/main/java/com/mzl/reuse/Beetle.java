package com.mzl.reuse;

/**
 * @ClassName： Beetle
 * @Description：
 * @author：lhg
 * @data：2020/11/11 17:37
 * @Version：1.0
 **/
class Insect {
    private int i = 9;
    protected int j;

    Insect() {
        System.out.println("i = " + i + ", j = " + j);
        j = 39;
    }

    private static int x1 = printInit("static Insect.x1 initialized");

    static int printInit(String s) {
        System.out.println(s);
        return 47;
    }
}

/**
 * 执行顺序
 * 1.执行 Beetle 类的main方法时，会先加载它的父类
 * 2.加载父类 Insect，会初始化静态变量 x1
 * 3.加载子类 Beetle，会初始化静态变量 x2
 * 4.执行打印
 * 5.new Beetle()，会先创建它父类，调用父类构造器，并执行打印（j 是基础类型，所以默认值为0）
 * 6.new Beetle()为主动调用，初始化项目，顺序执行，所以会初始化变量 k，调用父类方法，打印输出并赋值
 * 7.执行构造器内的打印
 */
public class Beetle extends Insect {
    private int k = printInit("Beetle.k.initialized");

    public Beetle() {
        System.out.println("k = " + k);
        System.out.println("j = " + j);
    }

    private static int x2 = printInit("static Beetle.x2 initialized");

    public static void main(String[] args) {
        System.out.println("Beetle constructor");
        Beetle b = new Beetle();
    }
}
