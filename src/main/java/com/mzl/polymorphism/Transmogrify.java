package com.mzl.polymorphism;

/**
 * @program: java8
 * @description: 使用继承设计
 * @author: may
 * @create: 2020-11-16 21:19
 * 组合不会强制设计是继承层次结构，而且组合更加灵活，因为可以动态地选择类型（因而选择相应的行为），而继承要求必须在编译时知道确切类型。
 **/
class Actor {
    public void act() {}
}

class HappyActor extends Actor {
    @Override
    public void act() {
        System.out.println("HappyActor");
    }
}

class SadActor extends Actor {
    @Override
    public void act() {
        System.out.println("SadActor");
    }
}

// 使用组合
class Stage {
    // Stage 对象中包含了 Actor 引用，该引用被初始化为指向一个 HappyActor 对象，这意味着 performPlay() 会产生一个特殊行为。
    private Actor actor = new HappyActor();

    public void change() {
        actor = new SadActor();
    }

    public void performPlay() {
        actor.act();
    }
}

public class Transmogrify {
    public static void main(String[] args) {
        Stage stage = new Stage();
        stage.performPlay();
        stage.change();
        stage.performPlay();
    }
}
