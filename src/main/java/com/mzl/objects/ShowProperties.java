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
        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("java.library.path"));
    }
}
