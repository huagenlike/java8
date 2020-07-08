package com.mzl.operators;

/**
 * @description:
 * @author: lhg
 * @date: Created in 2020/7/3 16:19
 * @version:
 * @modified By:
 * 使用的规则：
 *      仅限单 _，不能多条相连。
 *      数值开头和结尾不允许出现 _。
 *      F、D 和 L的前后禁止出现 _。
 *      二进制前导 b 和 十六进制 x 前后禁止出现 _。
 */
public class Underscores {
    public static void main(String[] args) {
        double d = 341_435_936.445_667;
        System.out.println(d);
        int bin = 0b0010_1111_1010_1111_1010_1111_1010_1111;
        System.out.println(Integer.toBinaryString(bin));
        System.out.printf("%x%n", bin); // [1]
        long hex = 0x7f_e9_b7_aa;
        System.out.printf("%x%n", hex);
        int aa = 111_222_333;
        System.out.println(aa);
    }
}
