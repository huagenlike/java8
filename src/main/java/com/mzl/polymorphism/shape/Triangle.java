package com.mzl.polymorphism.shape;

/**
 * @ClassName： Triangle
 * @Description：
 * @author：lhg
 * @data：2020/11/13 10:58
 * @Version：1.0
 **/
public class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Triangle.draw()");
    }
    @Override
    public void erase() {
        System.out.println("Triangle.erase()");
    }
}
