package com.mzl.innerclasses;

import com.mzl.innerclasses.controller.Event;

/**
 * @ClassName： GreenhouseController
 * @Description： 配置并执行温室系统
 * @author：lhg
 * @data：2020/11/20 15:03
 * @Version：1.0
 * 下面的类通过创建一个 GreenhouseControls 对象，并添加各种不同的 Event 对象来配置该系统，这是命令设计模式的一个例子—eventList 中的每个对象都被封装成对象的请求：
 **/
public class GreenhouseController {
    public static void main(String[] args) {
        GreenhouseControls gc = new GreenhouseControls();
        // 除了使用代码，您还可以从文本文件中解析配置信息：
        gc.addEvent(gc.new Bell(900));
        Event[] eventList = {
            gc.new ThermostatNight(0),
            gc.new LightOn(200),
            gc.new LightOff(400),
            gc.new WaterOn(600),
            gc.new WaterOff(800),
            gc.new ThermostatDay(1400)
        };
        gc.addEvent(gc.new Restart(2000, eventList));
        gc.addEvent(new GreenhouseControls.Terminate(5000));
        gc.run();
    }
}