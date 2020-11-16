package com.mzl.polymorphism;

/**
 * @ClassName： ReferenceCounting
 * @Description： 继承和清理
 * @author：lhg
 * @data：2020/11/16 16:04
 * @Version：1.0
 * 一旦某个成员对象被其它一个或多个对象共享时，问题就变得复杂了。
 **/
class Shared {
    private int refcount = 0;
    // 跟踪所创建的 Shared 实例数量
    private static long counter = 0;
    // id 是 final 的，因为它的值在初始化时确定后不应该变化
    private final long id = counter++;

    Shared() {
        System.out.println("Creating " + this);
    }

    public void addRef() {
        refcount++;
    }

    protected void dispose() {
        if (--refcount == 0) {
            System.out.println("Disposing " + this);
        }
    }

    @Override
    public String toString() {
        return "Shared " + id;
    }
}

class Composing {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;

    Composing(Shared shared) {
        System.out.println("Creating " + this);
        this.shared = shared;
        // 在将一个 shared 对象附着在类上时，必须记住调用 addRef()
        this.shared.addRef();
    }

    protected void dispose() {
        System.out.println("disposing " + this);
        // 而 dispose() 方法会跟踪引用数，以确定在何时真正地执行清理工作。
        shared.dispose();
    }

    @Override
    public String toString() {
        return "Composing " + id;
    }
}

public class ReferenceCounting {
    public static void main(String[] args) {
        Shared shared = new Shared();
        Composing[] composing = {
                new Composing(shared),
                new Composing(shared),
                new Composing(shared),
                new Composing(shared),
                new Composing(shared),
        };
        for (Composing c: composing) {
            c.dispose();
        }
    }
}
