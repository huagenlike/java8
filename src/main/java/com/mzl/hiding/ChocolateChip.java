package com.mzl.hiding;

import com.mzl.hiding.dessert.Cookie;

/**
 * @description:
 * @author: lhg
 * @date: Created in 2020/7/8 11:33
 * @version:
 * @modified By:
 * 如果你创建了一个新包，并从另一个包继承类，那么唯一能访问的就是被继承类的 public 成员。
 */
public class ChocolateChip extends Cookie {
    public ChocolateChip() {
        System.out.println("ChocolateChip constructor");
    }

    public void chomp() {
        //- bite(); // Can't access bite
    }

    public static void main(String[] args) {
        // new ChocolateChip() 会小实例化 父类的 实例，即父类会先执行构造方法
        ChocolateChip x = new ChocolateChip();
        x.chomp();
    }
}
