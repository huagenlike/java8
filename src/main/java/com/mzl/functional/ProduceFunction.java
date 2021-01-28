package com.mzl.functional;

import java.util.function.Function;

/**
 * @ClassName： ProduceFunction
 * @Description：
 * @author：lhg
 * @data：2021/1/28 11:23
 * @Version：1.0
 * 这里，produce() 是高阶函数。
 * [1] 使用继承，可以轻松地为专用接口创建别名。
 * [2] 使用 Lambda 表达式，可以轻松地在方法中创建和返回一个函数。
 **/
interface FuncSS extends Function<String, String> {} // [1]

public class ProduceFunction {
    static FuncSS produce() {
        return s -> s.toLowerCase(); // [2]
    }
    public static void main(String[] args) {
        FuncSS f = produce();
        // apply(T t) 将此函数应用于给定参数
        System.out.println(f.apply("YELLING"));
    }
}
