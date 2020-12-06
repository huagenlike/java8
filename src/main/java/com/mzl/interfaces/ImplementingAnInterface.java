package com.mzl.interfaces;

/**
 * @ClassName： ImplementingAnInterface
 * @Description： 接口继承
 * @author：lhg
 * @data：2020/11/17 11:02
 * @Version：1.0
 * 接口只是外形，现在我要说明它是如何工作的。除此之外，它看起来像继承。
 **/
interface Concept { // Package access
    void idea1();
    void idea2();
}

class Implementation implements Concept {
    @Override
    public void idea1() {
        System.out.println("idea1");
    }

    @Override
    public void idea2() {
        System.out.println("idea2");
    }
}
