package com.mzl.hiding;

import com.mzl.simple.*;
import java.util.*;

/**
 * @description:
 * @author: lhg
 * @date: Created in 2020/7/8 10:57
 * @version:
 * @modified By:
 */
public class LibTest {
    public static void main(String[] args) {
        // 因为 import 导入的两个包都包含 Vector 类，所以，不指定的话，编译器不知道时哪个类，所以会报错
        //Vector v = new Vector();
        com.mzl.simple.Vector v = new com.mzl.simple.Vector();
        //List l = new List();
    }
}
