package com.mzl.objects;

/**
 * @ClassName： Hello
 * @Description：
 * @author：lhg
 * @data：2020/11/5 17:48
 * @Version：1.0
 **/
public class Hello {
    public static void main(String[] args) {
        Demo demo = new Demo();
        Demo demo1 = new Demo();

        System.out.println(demo.getI());
        System.out.println(demo1.getI());
        demo1.setI(20);
        System.out.println(demo.getI());
    }
}

class Demo {
    // 即使你创建了两个 Demo 对象，但是静态变量 i 仍只占一份存储空间。两个对象都会共享相同的变量 i
    static int i = 10;

    public int getI () {
        return i;
    }

    public void setI (int num) {
        i = num;
    }
}
