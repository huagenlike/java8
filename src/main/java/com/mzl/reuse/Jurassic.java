package com.mzl.reuse;

/**
 * @ClassName： Jurassic
 * @Description： final 类
 * @author：lhg
 * @data：2020/11/11 17:31
 * @Version：1.0
 **/
class SmallBrain {}

final class Dinosaur {
    int i = 7;
    int j = 1;
    SmallBrain x = new SmallBrain();

    void f() {}
}

// class Further extends Dinosaur {}
// error: Cannot extend final class 'Dinosaur'
public class Jurassic {
    public static void main(String[] args) {
        Dinosaur n = new Dinosaur();
        n.f();
        n.i = 40;
        n.j++;
    }
}
