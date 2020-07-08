package com.mzl.housekeeping;

/**
 * @description:
 * @author: lhg
 * @date: Created in 2020/7/7 14:57
 * @version:
 * @modified By:
 */
class Cup {
    Cup(int marker) {
        System.out.println("Cup(" + marker + ")");
    }

    void f(int marker) {
        System.out.println("f(" + marker + ")");
    }
}

class Cups {
    static Cup cup1;
    static Cup cup2;

    static {
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }

    Cups() {
        System.out.println("Cups()");
    }
}

public class ExplicitStatic {
    public static void main(String[] args) {
        System.out.println("Inside main()");
        // 不会执行构造方法，只有在实例化时才会调用构造方法
        Cups.cup1.f(99); // [1]
    }

     // static Cups cups1 = new Cups(); // [2]
     // static Cups cups2 = new Cups(); // [2]
}
