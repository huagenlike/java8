package com.mzl.reuse;

/**
 * @ClassName： FinalArguments
 * @Description：
 * @author：lhg
 * @data：2020/11/11 17:18
 * @Version：1.0
 **/
class Gizmo {
    public void spin() {

    }
}

public class FinalArguments {
    void with(final Gizmo g) {
        //-g = new Gizmo(); // Illegal -- g is final
    }

    void without(Gizmo g) {
        g = new Gizmo(); // OK -- g is not final
        g.spin();
    }

    //void f(final int i) { i++; } // Can't change
    // You can only read from a final primitive
    int g(final int i) {
        return i + 1;
    }

    public static void main(String[] args) {
        FinalArguments bf = new FinalArguments();
        bf.without(null);
        bf.with(null);
        int g = bf.g(10);
        int g1 = bf.g(11);
        System.out.printf("");

    }
}
