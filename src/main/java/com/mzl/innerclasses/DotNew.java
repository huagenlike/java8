package com.mzl.innerclasses;

/**
 * @ClassName： DotNew
 * @Description：
 * @author：lhg
 * @data：2020/11/18 16:07
 * @Version：1.0
 * 使用.new语法直接创建内部类
 **/
public class DotNew {
    public class Inner {}
    public static void main(String[] args) {
        DotNew dn = new DotNew();
        DotNew.Inner dni = dn.new Inner();
    }
}
