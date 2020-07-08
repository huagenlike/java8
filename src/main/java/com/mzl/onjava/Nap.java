// onjava/Nap.java
// (c)2017 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
package com.mzl.onjava;
import java.util.concurrent.*;

/**
 * @description
 * @author lhg
 * @date 2020/7/6 17:03
 * @return
 * 原来是对Thread.sleep方法的包装，实现是一样的，只是多了时间单位转换和验证，然而TimeUnit枚举成员的方法却提供更好的可读性，这可能就是当初创建TimeUnit时提供sleep方法的原因吧，大家都知道sleep方法很常用，但经常要使用一个常量保存sleep的时间，比如3秒钟，我们代码通常会这样写:
 * 因为Thread.sleep方法参数接受的毫秒单位的数值，比较下面代码就知道TimeUnit枚举成员的sleep方法更优雅：
 * TimeUnit.MILLISECONDS.sleep(10);
 * TimeUnit.SECONDS.sleep(10);
 * TimeUnit.MINUTES.sleep(10);
 * Thread.sleep(10);
 * Thread.sleep(10*1000);
 * Thread.sleep(10*60*1000);
 */

public class Nap {
  public Nap(double t) { // Seconds
    try {
      TimeUnit.MILLISECONDS.sleep((int)(1000 * t));
    } catch(InterruptedException e) {
      throw new RuntimeException(e);
    }
  }
  public Nap(double t, String msg) {
    this(t);
    System.out.println(msg);
  }
}
