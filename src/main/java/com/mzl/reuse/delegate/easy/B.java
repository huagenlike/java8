package com.mzl.reuse.delegate.easy;

/**
 * @ClassName： B
 * @Description：
 * @author：lhg
 * @data：2020/11/11 16:42
 * @Version：1.0
 **/
public class B {
    private A a;

    public B(A a){
        this.a = a;
    }
    public void foo(){
        a.foo();
    }
    public void say(){
        System.out.println("its B saying !");
    }

    public static void main(String[] args) {
        B b = new B(new A());
        b.say();
    }
}
