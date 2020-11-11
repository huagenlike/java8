package com.mzl.reuse.delegate.easy;

/**
 * @ClassName： A
 * @Description：
 * @author：lhg
 * @data：2020/11/11 16:42
 * @Version：1.0
 **/
public class A {
    private void proc(){
        this.say();
    }
    public void foo(){
        System.out.println("its A foo!");
    }
    private void say(){
        System.out.println("its A saying!");
    }
}
