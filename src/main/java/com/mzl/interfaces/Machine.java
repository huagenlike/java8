package com.mzl.interfaces;

/**
 * @ClassName： Machine
 * @Description： 接口中的静态方法
 * @author：lhg
 * @data：2020/11/17 12:08
 * @Version：1.0
 * 这是模版方法设计模式的一个版本（在“设计模式”一章中详细描述），runOps() 是一个模版方法。
 * runOps() 使用可变参数列表，因而我们可以传入任意多的 Operation 参数并按顺序运行它们：
 **/
class Bing implements Operations {
    @Override
    public void execute() {
        Operations.show("Bing");
    }
}

class Crack implements Operations {
    @Override
    public void execute() {
        Operations.show("Crack");
    }
}

class Twist implements Operations {
    @Override
    public void execute() {
        Operations.show("Twist");
    }
}

public class Machine {
    public static void main(String[] args) {
        Operations.runOps(new Bing(), new Crack(), new Twist());
    }
}
