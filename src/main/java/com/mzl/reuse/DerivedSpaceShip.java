package com.mzl.reuse;

/**
 * @description:
 * @author: lhg
 * @date: Created in 2020/7/8 17:33
 * @version:
 * @modified By:
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
