package com.mzl.functional;

/**
 * @ClassName： RunnableMethodReference
 * @Description： Runnable接口
 * @author：lhg
 * @data：2021/1/27 10:03
 * @Version：1.0
 * 方法引用与 Runnable 接口的结合使用
 * Thread 对象将 Runnable 作为其构造函数参数，并具有会调用 run() 的方法 start()。
 * 注意，只有匿名内部类才需要具有名为 run() 的方法。
 **/
class Go {
    static void go() {
        System.out.println("Go::go()");
    }

    static void show(String msg) {
        System.out.println(msg);
    }
}

public class RunnableMethodReference {
    public static void main(String[] args) {

        // JDK7 匿名内部类写法
        // Thread 对象将 Runnable 作为其构造函数参数，并具有会调用 run() 的方法 start()。
        new Thread(new Runnable() {
            // 注意，只有匿名内部类才需要具有名为 run() 的方法。
            public void run() {
                System.out.println("Anonymous");
            }
        }).start();

        // JDK8 Lambda表达式写法
        new Thread(
                () -> System.out.println("lambda")
        ).start();

        new Thread(Go::go).start();
    }
}
