package com.mzl.innerclasses;

/**
 * @ClassName： ClassInInterface
 * @Description： 接口内部的类
 * @author：lhg
 * @data：2020/11/20 11:03
 * @Version：1.0
 * {java ClassInInterface$Test}
 * 如果你想要创建某些公共代码，使得它们可以被某个接口的所有不同实现所共用，那么使用接口内部的嵌套类会显得很方便。
 **/
public interface ClassInInterface {
    void howdy();
    class Test implements ClassInInterface {
        @Override
        public void howdy() {
            System.out.println("Howdy!");
        }
        public static void main(String[] args) {
            new Test().howdy();
        }
    }
}
