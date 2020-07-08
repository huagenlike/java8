package com.mzl.hiding;

/**
 * @description:
 * @author: lhg
 * @date: Created in 2020/7/8 15:42
 * @version:
 * @modified By:
 * 为了防止类被外界访问，可以将所有的构造器声明为 private，这样只有你自己能创建对象（在类的 static 成员中）
 */
class Soup1 {
    private Soup1() {}

    public static Soup1 makeSoup() { // [1]
        return new Soup1();
    }
}

class Soup2 {
    private Soup2() {}

    private static Soup2 ps1 = new Soup2(); // [2]

    public static Soup2 access() {
        return ps1;
    }

    public void f() {}
}
// Only one public class allowed per file:
public class Lunch {
    void testPrivate() {
        // Can't do this! Private constructor:
        //- Soup1 soup = new Soup1();
    }

    void testStatic() {
        Soup1 soup = Soup1.makeSoup();
    }

    void testSingleton() {
        Soup2.access().f();
    }
}
