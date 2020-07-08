package com.mzl.reuse;

/**
 * @description:
 * @author: lhg
 * @date: Created in 2020/7/8 17:18
 * @version:
 * @modified By:
 * 构造从基类“向外”进行，因此基类在派生类构造函数能够访问它之前进行初始化。
 */
class Art {
    Art() {
        System.out.println("Art constructor");
    }
}

class Drawing extends Art {
    Drawing() {
        System.out.println("Drawing constructor");
    }
}

public class Cartoon extends Drawing {
    public Cartoon() {
        System.out.println("Cartoon constructor");
    }
    public static void main(String[] args) {
        Cartoon x = new Cartoon();
    }
}
