package com.mzl.polymorphism.shape;

/**
 * @ClassName： Shapes
 * @Description：
 * @author：lhg
 * @data：2020/11/13 11:02
 * @Version：1.0
 **/
public class Shapes {
    public static void main(String[] args) {
        RandomShapes gen = new RandomShapes();
        // 进行多态方法调用:
        for (Shape shape: gen.array(9)) {
            shape.draw();
        }
    }
}
