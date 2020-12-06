package com.mzl.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName： AsListInference
 * @Description：
 * @author：lhg
 * @data：2020/12/4 11:06
 * @Version：1.0
 **/
class Snow {}
class Powder extends Snow {}
class Light extends Powder {}
class Heavy extends Powder {}
class Crusty extends Snow {}
class Slush extends Snow {}

public class AsListInference {
    public static void main(String[] args) {
        List<Snow> snow1 = Arrays.asList(new Crusty(), new Slush(), new Powder());
        // 直接使用 Arrays.asList() 的输出作为一个 List ，但是这里的底层实现是数组，没法调整大小。
         snow1.add(new Heavy()); // Exception

        List<Snow> snow2 = Arrays.asList(new Light(), new Heavy());
        //- snow2.add(new Slush()); // Exception

        List<Snow> snow3 = new ArrayList<>();
        Collections.addAll(snow3,new Light(), new Heavy(), new Powder());
        snow3.add(new Crusty());

        // 带有显式类型参数说明的提示：
        // 注意 Arrays.asList() 中间的“暗示”（即 <Snow> ），告诉编译器 Arrays.asList() 生成的结果 List 类型的实际目标类型是什么。
        List<Snow> snow4 = Arrays.<Snow>asList(new Light(), new Heavy(), new Slush());
        //- snow4.add(new Powder()); // Exception
    }
}
