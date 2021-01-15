package com.mzl.regularexpression;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassName： SimpleDemo
 * @Description：
 * @author：lhg
 * @data：2021/1/15 9:20
 * @Version：1.0
 * abc 匹配包含abc字符串
 * ^begin: 匹配以begin开头的字符串
 * end$: 匹配以end 结尾的字符串
 * a* 字符a出现0次或者更多次，等价于{0,}
 * a{0,} 字符a出现0次或者更多次
 * a{3} 字符a出现3次，不能多也不能少
 * a+ 字符a出现1次或者更多次，等价于{1,}
 * a{1,} 字符a出现1次或者更多次
 * a? 字符a出现0次或者1次，等价于{0,1}
 * a{0,1} 字符a出现0次或者1次
 * (ab){0,1} 字符ab出现0次或者1次，也就是说ab一起匹配
 * a.b 字符a与字符b之间可以是任意字符(\n除外)
 * (a│bc|d)e 可以是ae或者是bce或者是de
 * [ab] 匹配单个的a或者b(中括号中只会匹配其中一个单词)
 * [a-d] 匹配a到d之间的某一个单词(包括a和d)
 * %[^a-zA-Z]% 在[]内的^代表排除里面的字符，例如这个代表以%开头，并以%结尾，并且中间是非字符的字符串
 * \w 匹配任意单词(包括下划线)，但是-等不再范围内，等价于[A-Za-z0-9_]
 * \d 匹配任意数字。等价于[0-9]
 **/
public class SimpleDemo {
    public static void main(String[] args) {
        demo13();
    }

    // 匹配abc字符串，不能多也不能少
    public static void demo1() {
        List<String> list = Arrays.asList("abc", "abcd", "dabc");
        String regex="^abc$";
        for (String str : list) {
            Matcher m= Pattern.compile(regex).matcher(str);
            boolean result = m.find();
            System.out.println(result);
//            while(m.find()){
//                System.out.println(m.group());
//            }
        }
    }
    // 用\  或者 []包围都能取到特殊字符
    // 匹配a*b.178 这个字符串
    public static void demo2() {
        // 用\包围都能取到特殊字符
        String regex = "^a\\*b\\.178$";
        Matcher m= Pattern.compile(regex).matcher("a*b.178");
        boolean result = m.find();
        System.out.println(result);
        // 用[]包围都能取到特殊字符
        String regex1 = "^a[*]b[.]178$";
        m= Pattern.compile(regex1).matcher("a*b.178");
        result = m.find();
        System.out.println(result);
        // 用[]包围都能取到特殊字符
        String regex2 = "^a[*]b[.]178$";
        m= Pattern.compile(regex2).matcher("a*c.178");
        result = m.find();
        System.out.println(result);
    }
    // 匹配以.js结尾的字符串，但是不能只是.js
    public static void demo3() {
        List<String> list = Arrays.asList("a.js", "-.js", ".js");
        // . 匹配除换行符 \n 之外的任何单字符。要匹配 . ，请使用 \. 。
        // + 匹配前面的子表达式一次或多次。要匹配 + 字符，请使用 \+。
        // 用[]包围都能取到特殊字符
        String regex = ".+[.]js$";
        for (String str : list) {
            Matcher m = Pattern.compile(regex).matcher(str);
            boolean result = m.find();
            System.out.println(result);
        }
    }
    // 匹配.min.css结尾的css文件
    public static void demo4() {
        // \w 匹配字母、数字、下划线。等价于 [A-Za-z0-9_]
        // + 匹配前面的子表达式一次或多次。要匹配 + 字符，请使用 \+。
        String regex = "\\w+[.]min[.]css$";
        List<String> list = Arrays.asList("a.min.css", ".min.css", "-.min.css", "测试.min.css");
        for (String str : list) {
            Matcher m = Pattern.compile(regex).matcher(str);
            boolean result = m.find();
            System.out.println(result);
        }
    }
    // 匹配字符串是否是纯数字组成
    public static void demo5() {
        String regex = "^[0-9]+$";
        List<String> list = Arrays.asList("123", "1234", "");
        for (String str : list) {
            Matcher m = Pattern.compile(regex).matcher(str);
            boolean result = m.find();
            System.out.println(result);
        }
    }
    // 匹配一个非0开头的非负整数，但可以是0本身
    public static void demo6() {
        // * 匹配前面的子表达式零次或多次。要匹配 * 字符，请使用 \*。
        String regex = "^(0|[1-9][0-9]*)$";
        List<String> list = Arrays.asList("123", "0", "01");
        for (String str : list) {
            Matcher m = Pattern.compile(regex).matcher(str);
            boolean result = m.find();
            System.out.println(result);
        }
    }
    // 匹配一个10进制数字
    public static void demo7() {
        //可以是整数或者浮点小数
        //可以是负数
        //除了0本身，不能以0开头
        String regex = "^-?(0|([1-9][0-9]*)+)(\\.[0-9]+)?$";
        List<String> list = Arrays.asList("0", "-0", "10.01", "0.1", "-0.1", "0.0", "101", "00.1", ".1", "001", "-.1");
        for (String str : list) {
            Matcher m = Pattern.compile(regex).matcher(str);
            boolean result = m.find();
            System.out.println(result);
        }
    }
    // 验证是否是有效的EMAIL邮箱
    public static void demo8() {
        String regex = "^(\\w)+([-.]\\w+)*@(\\w)+((\\.\\w{2,4}){1,3})$";
        List<String> list = Arrays.asList("abcd_s.ddf.ff-sss@qq.com","abcd_s.ddf.ff-sss@abc.vip.qq.com","abcd_s.ddf.ff-sss@abc.vip11.qq.com","abcd_s.ddf.ff-sss@a.abc.vip.qq.com","abcd_s.ddf.ff-sss@abc.v-p.qq.com","abcd_s.ddf.ff-sss@.com","abcd_s.ddf.ff-sss@com","-dai@qq.com","dai.@qq.com","d--ai@qq.com","d..ai@qq.com","d-.ai@qq.com");
        for (String str : list) {
            Matcher m = Pattern.compile(regex).matcher(str);
            boolean result = m.find();
            System.out.println(result);
        }
    }
    //
    public static void demo9() {
        String regex = "ab";
        Matcher m = Pattern.compile(regex).matcher("aabcab");
        boolean result = m.find();
        System.out.println(result);
    }
    // 贪婪匹配模式
    // 定义：正则表达式去匹配时，会尽量多的匹配符合条件的内容
    // 标识符：+，?，*，{n}，{n,}，{n,m}
    public static void demo10() {
        String regex = "a.*b";
        Matcher m = Pattern.compile(regex).matcher("aacbacbc");
       while (m.find()) {
           System.out.println(m.group());
       }
        regex = "ac.*b";
        m = Pattern.compile(regex).matcher("aacbacbc");
        while (m.find()) {
            System.out.println(m.group());
        }
    }
    // 非贪婪匹配模式
    // 定义：正则表达式去匹配时，会尽量少的匹配符合条件的内容 也就是说，一旦发现匹配符合要求，立马就匹配成功，而不会继续匹配下去(除非有g，开启下一组匹配)
    // 标识符：+?，??，*?，{n}?，{n,}?，{n,m}?
    public static void demo11() {
        String regex = "a.*?b";
        // 匹配到第一个a后，开始匹配.*?，由于是非贪婪模式，它在匹配到了第一个b后，就匹配成功了，因此匹配结果是aacb
        Matcher m = Pattern.compile(regex).matcher("acabacbc");
        while (m.find()) {
            System.out.println(m.group());
        }
        regex = "ac.*?b";
        m = Pattern.compile(regex).matcher("aacbacbc");
        while (m.find()) {
            System.out.println(m.group());
        }
        System.out.println("----------------");
        // 非贪婪模式
        regex = "a.*?";
        m = Pattern.compile(regex).matcher("aacbacbc");
        while (m.find()) {
            System.out.println(m.group());
        }System.out.println("----------------");
        // 贪婪模式
        regex = "a.*";
        m = Pattern.compile(regex).matcher("aacbacbc");
        while (m.find()) {
            System.out.println(m.group());
        }
    }
    // 提取HTML中的Div标签
    public static void demo12() {
        String html = "<div><span>用户:<span/><span>张三<span/></div><div><span>密码:<span/><span>123456<span/></div>";
        String regex = "<div>.*?<\\/div>";
        Matcher m = Pattern.compile(regex).matcher(html);
        while (m.find()) {
            System.out.println(m.group());
        }
        System.out.println("---------------");
        regex = "<div>.*<\\/div>";
        m = Pattern.compile(regex).matcher(html);
        while (m.find()) {
            System.out.println(m.group());
        }
    }
    // 提取两个""中的子串，其中不能再包含""
    public static void demo13() {
        String str = "\"The phrase \\\"regular expression\\\" is called \\\"Regex\\\" for short\"";
        String regex = "\".*?";
        Matcher m = Pattern.compile(regex).matcher(str);
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
