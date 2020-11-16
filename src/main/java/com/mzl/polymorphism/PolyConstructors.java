package com.mzl.polymorphism;

/**
 * @ClassName： PolyConstructors
 * @Description： 构造器内部多态方法的行为
 * @author：lhg
 * @data：2020/11/16 16:27
 * @Version：1.0
 * Glyph 的 draw() 被设计为可重写，在 RoundGlyph 这个方法被重写。
 * 但是 Glyph 的构造器里调用了这个方法，结果调用了 RoundGlyph 的 draw() 方法，这看起来正是我们的目的。
 * 初始化的实际过程是：
 *  1.在所有事发生前，分配给对象的存储空间会被初始化为二进制 0。
 *  2.如前所述调用基类构造器。此时调用重写后的 draw() 方法（是的，在调用 RoundGraph 构造器之前调用），由步骤 1 可知，radius 的值为 0。
 *  3.按声明顺序初始化成员。
 *  4.最终调用派生类的构造器。
 **/
class Glyph {
    void draw() {
        System.out.println("Glyph.draw()");
    }
    Glyph() {
        System.out.println("Glyph() before draw()");
        // TODO 为什么这里会调用派生类重写的方法？？？
        draw();
        System.out.println("Glyph() after draw()");
    }
}

class RoundGlyph extends Glyph {
    private int radius = 1;
    RoundGlyph(int r) {
        radius = r;
        System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
    }
    @Override
    void draw() {
        System.out.println("RoundGlyph.draw(), radius = " + radius);
    }
}

public class PolyConstructors {
    public static void main(String[] args) {
        new RoundGlyph(5);
    }
}
