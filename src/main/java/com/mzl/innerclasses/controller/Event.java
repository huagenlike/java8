package com.mzl.innerclasses.controller;

import java.time.Duration;
import java.time.Instant;

/**
 * @ClassName： Event
 * @Description： 内部类与控制框架
 * @author：lhg
 * @data：2020/11/20 14:40
 * @Version：1.0
 * 任何控制事件的常用方法
 **/
public abstract class Event {
    private Instant eventTime;
    protected final Duration delayTime;
    public Event(long millisecondDelay) {
        // start() 获取当前时间，然后加上一个延迟时间，这样生成触发事件的时间。
        delayTime = Duration.ofMillis(millisecondDelay);
        start();
    }
    // 是一个独立的方法，而没有包含在构造器内，因为这样就可以在事件运行以后重新启动计时器，也就是能够重复使用 Event 对象。
    // 例如，如果想要重复一个事件，只需简单地在 action() 中调用 start() 方法。
    public void start() { // 允许重启
        eventTime = Instant.now().plus(delayTime);
    }
    // 告诉你何时可以运行 action() 方法了
    // 当然，可以在派生类中覆盖 ready() 方法，使得 Event 能够基于时间以外的其他因素而触发。
    public boolean ready() {
        return Instant.now().isAfter(eventTime);
    }
    public abstract void action();
}
