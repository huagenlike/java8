package com.mzl.innerclasses;

/**
 * @ClassName： Callbacks
 * @Description：
 * @author：lhg
 * @data：2020/11/20 11:32
 * @Version：1.0
 * 使用内部类进行回调
 * 通过内部类提供闭包的功能是优良的解决方案，它比指针更灵活、更安全。
 * {java innerclasses.Callbacks}
 * 这个例子进一步展示了外部类实现一个接口与内部类实现此接口之间的区别。
 **/
interface Incrementable {
    void increment();
}
// 只需实现接口就非常简单:
class Callee1 implements Incrementable {
    private int i = 0;
    @Override
    public void increment() {
        i++;
        System.out.println(i);
    }
}
class MyIncrement {
    public void increment() {
        System.out.println("Other operation");
    }
    static void f(MyIncrement mi) { mi.increment(); }
}
// 如果您的类必须以其他方式实现 increment（），则必须使用内部类
class Callee2 extends MyIncrement {
    private int i = 0;
    @Override
    public void increment() {
        super.increment();
        i++;
        System.out.println(i);
    }
    // 内部类 Closure 实现了 Incrementable，以提供一个返回 Callee2 的“钩子”（hook）-而且是一个安全的钩子。
    private class Closure implements Incrementable {
        @Override
        public void increment() {
            // 指定外部类方法，否则将获得无限递归:
            Callee2.this.increment();
        }
    }
    Incrementable getCallbackReference() {
        return new Closure();
    }
}
class Caller {
    private Incrementable callbackReference;
    Caller(Incrementable cbh) {
        callbackReference = cbh;
    }
    void go() { callbackReference.increment(); }
}
public class Callbacks {
    public static void main(String[] args) {
        Callee1 c1 = new Callee1();
        Callee2 c2 = new Callee2();
        /**
         * 1.调用 MyIncrement 类的静态方法 f()
         * 2.c2 是 Callee2 的引用，是 MyIncrement 的派生类，所以 mi.increment() 实际上调用的是 Callee2 类的 increment() 方法
         * 3.Callee2 类的 increment() 方法
         */
        MyIncrement.f(c2);
        /**
         * 1.Caller 的有参构造器，传递的是 对象 Incrementable
         * 2.c1 是 Callee1 的引用， Callee1 是 Incrementable 的派生类
         * 3.所以 Caller 的回调参数是 Callee1
         */
        Caller caller1 = new Caller(c1);
        /**
         * 1.Caller 的有参构造器，传递的是 对象 Incrementable
         * 2.c2 是 Callee2 的引用，Callee2 的 getCallbackReference 能获取到其内部内 Closure，内部类 Closure 是 Incrementable 的派生类
         * 3.所以 Caller 的回调参数是 Callee2$Closure
         */
        Caller caller2 = new Caller(c2.getCallbackReference());
        /**
         * 1.Caller 类的go() 方法，callbackReference 是 Callee1 的引用
         * 2.执行的是 Callee1 类的 increment() 方法
         */
        caller1.go();
        /**
         * 1.Caller 类的go() 方法，callbackReference 是 Callee1 的引用
         * 2.执行的是 Callee1 类的 increment() 方法
         */
        caller1.go();
        /**
         * 1.Caller 类的go() 方法，callbackReference 是 Callee2$Closure 的引用
         * 2.Callee2 的内部类 Closure，increment() 方法，在方法内回调 Callee2 的 increment() 方法
         */
        caller2.go();
        /**
         * 1.Caller 类的go() 方法，callbackReference 是 Callee2$Closure 的引用
         * 2.Callee2 的内部类 Closure，increment() 方法，在方法内回调 Callee2 的 increment() 方法
         */
        caller2.go();
    }
}
