package com.mzl.reuse;

/**
 * @description:
 * @author: lhg
 * @date: Created in 2020/7/8 17:33
 * @version:
 * @modified By:
 * DerivedSpaceShip 并不是真正的“一种” SpaceShipControls ，即使你“告诉” DerivedSpaceShip 调用 forward()。
 * 更准确地说，一艘宇宙飞船包含了 **SpaceShipControls **，同时 SpaceShipControls 中的所有方法都暴露在宇宙飞船中。委托解决了这个难题:
 */
public class DerivedSpaceShip extends SpaceShipControls {
    private String name;

    public DerivedSpaceShip(String name) {
        this.name = name;
    }

    @Override
    public String toString() { return name; }

    public static void main(String[] args) {
        DerivedSpaceShip protector = new DerivedSpaceShip("NSEA Protector");
        protector.forward(100);
    }
}
