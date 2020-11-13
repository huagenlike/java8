package com.mzl.polymorphism.shape;

/**
 * @ClassName： Square
 * @Description：
 * @author：lhg
 * @data：2020/11/13 10:58
 * @Version：1.0
 **/
public class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Square.draw()");
    }
    @Override
    public void erase() {
        System.out.println("Square.erase()");
    }
}

