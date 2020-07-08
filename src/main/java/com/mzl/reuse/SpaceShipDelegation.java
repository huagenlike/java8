package com.mzl.reuse;

/**
 * @description: 委托
 * @author: lhg
 * @date: Created in 2020/7/8 17:47
 * @version:
 * @modified By:
 *  DerivedSpaceShip 并不是真正的“一种” SpaceShipControls ，即使你“告诉” DerivedSpaceShip 调用 forward()。
 *  更准确地说，一艘宇宙飞船包含了 **SpaceShipControls **，同时 SpaceShipControls 中的所有方法都暴露在宇宙飞船中。
 *  委托解决了这个难题:
 *
 *  方法被转发到底层 control 对象，因此接口与继承的接口是相同的。
 *  但是，你对委托有更多的控制，因为你可以选择只在成员对象中提供方法的子集。
 */
public class SpaceShipDelegation {
    private String name;
    private SpaceShipControls controls = new SpaceShipControls();
    public SpaceShipDelegation(String name) {
        this.name = name;
    }
    // Delegated methods:
    public void back(int velocity) {
        controls.back(velocity);
    }
    public void down(int velocity) {
        controls.down(velocity);
    }
    public void forward(int velocity) {
        controls.forward(velocity);
    }
    public void left(int velocity) {
        controls.left(velocity);
    }
    public void right(int velocity) {
        controls.right(velocity);
    }
    public void turboBoost() {
        controls.turboBoost();
    }
    public void up(int velocity) {
        controls.up(velocity);
    }
    public static void main(String[] args) {
        SpaceShipDelegation protector = new SpaceShipDelegation("NSEA Protector");
        protector.forward(100);
    }
}
