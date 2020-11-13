package com.mzl.polymorphism.shape;

/**
 * @ClassName： Circle
 * @Description：
 * @author：lhg
 * @data：2020/11/13 10:58
 * @Version：1.0
 **/
public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle.draw()");
    }
    @Override
    public void erase() {
        System.out.println("Circle.erase()");
    }
}
