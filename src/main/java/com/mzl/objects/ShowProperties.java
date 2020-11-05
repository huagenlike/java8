package com.mzl.objects;

/**
 * @description:
 * @author: lhg
 * @date: Created in 2020/7/2 9:36
 * @version:
 * @modified By:
 */
public class ShowProperties {
    public static void main(String[] args) {
        // main() 方法中的第一行会输出所有的系统字段，也就是环境信息。 list() 方法将结果发送给它的参数 System.out。
        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("java.library.path"));
    }
}
