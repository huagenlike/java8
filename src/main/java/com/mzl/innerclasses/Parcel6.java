package com.mzl.innerclasses;

/**
 * @ClassName： Parcel6
 * @Description： 一个定义在作用域内的类，此作用域在方法的内部
 * @author：lhg
 * @data：2020/11/18 17:17
 * @Version：1.0
 * 在范围内嵌套类
 **/
public class Parcel6 {
    private void internalTracking(boolean b) {
        if(b) {
            class TrackingSlip {
                private String id;
                TrackingSlip(String s) {
                    id = s;
                }
                String getSlip() { return id; }
            }
            TrackingSlip ts = new TrackingSlip("slip");
            String s = ts.getSlip();
        }
        // 不能在这里用它! 超出范围:
        // TrackingSlip ts = new TrackingSlip("x");
    }
    public void track() { internalTracking(true); }
    public static void main(String[] args) {
        Parcel6 p = new Parcel6();
        p.track();
    }
}
