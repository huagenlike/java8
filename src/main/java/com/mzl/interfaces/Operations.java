package com.mzl.interfaces;

/**
 * @ClassName： Operations
 * @Description： 接口中的静态方法
 * @author：lhg
 * @data：2020/11/17 12:07
 * @Version：1.0
 * Java 8 允许在接口中添加静态方法。
 **/
public interface Operations {
    void execute();

    static void runOps(Operations... ops) {
        for (Operations op: ops) {
            op.execute();
        }
    }

    static void show(String msg) {
        System.out.println(msg);
    }
}
