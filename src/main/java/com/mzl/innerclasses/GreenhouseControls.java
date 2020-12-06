package com.mzl.innerclasses;

import com.mzl.innerclasses.controller.Controller;
import com.mzl.innerclasses.controller.Event;

/**
 * @ClassName： GreenhouseControls
 * @Description：
 * @author：lhg
 * @data：2020/11/20 14:51
 * @Version：1.0
 * 这在单个类中产生了控制系统的特定应用程序。内部类使您可以为每种事件封装不同的功能。
 *
 * 如控制温室的运作：控制灯光、水、温度调节器的开关，以及响铃和重新启动系统，每个行为都是完全不同的。
 * 控制框架的设计使得分离这些不同的代码变得非常容易。
 * 使用内部类，可以在单一的类里面产生对同一个基类 Event 的多种派生版本。
 * 对于温室系统的每一种行为，都继承创建一个新的 Event 内部类，并在要实现的 action() 中编写控制代码。
 *
 * light，water 和 thermostat 都属于外部类 GreenhouseControls，而这些内部类能够自由地访问那些字段，无需限定条件或特殊许可。
 * 而且，action() 方法通常都涉及对某种硬件的控制。
 * 大多数 Event 类看起来都很相似，但是 Bell 和 Restart 则比较特别。
 * Bell 控制响铃，然后在事件列表中增加一个 Bell 对象，于是过一会儿它可以再次响铃。
 * 读者可能注意到了内部类是多么像多重继承：Bell 和 Restart 有 Event 的所有方法，并且似乎也拥有外部类 GreenhouseContrlos 的所有方法。
 **/
public class GreenhouseControls extends Controller {
    // 灯光
    private boolean light = false;
    public class LightOn extends Event {
        public LightOn(long delayTime) {
            super(delayTime);
        }
        @Override
        public void action() {
            // 将硬件控制代码放在此处以实际打开灯。
            light = true;
        }
        @Override
        public String toString() {
            return "Light is on";
        }
    }
    public class LightOff extends Event {
        public LightOff(long delayTime) {
            super(delayTime);
        }
        @Override
        public void action() {
            // 将硬件控制代码放在此处以物理关闭灯。
            light = false;
        }
        @Override
        public String toString() {
            return "Light is off";
        }
    }
    // 水
    private boolean water = false;
    public class WaterOn extends Event {
        public WaterOn(long delayTime) {
            super(delayTime);
        }
        @Override
        public void action() {
            // 将硬件控制代码放在此处。
            water = true;
        }
        @Override
        public String toString() {
            return "Greenhouse water is on";
        }
    }
    public class WaterOff extends Event {
        public WaterOff(long delayTime) {
            super(delayTime);
        }
        @Override
        public void action() {
            // 将硬件控制代码放在此处。
            water = false;
        }
        @Override
        public String toString() {
            return "Greenhouse water is off";
        }
    }
    // 温度调接
    private String thermostat = "Day";
    public class ThermostatNight extends Event {
        public ThermostatNight(long delayTime) {
            super(delayTime);
        }
        @Override
        public void action() {
            // 将硬件控制代码放在此处。
            thermostat = "Night";
        }
        @Override
        public String toString() {
            return "Thermostat on night setting";
        }
    }
    public class ThermostatDay extends Event {
        public ThermostatDay(long delayTime) {
            super(delayTime);
        }
        @Override
        public void action() {
            // 将硬件控制代码放在此处。
            thermostat = "Day";
        }
        @Override
        public String toString() {
            return "Thermostat on day setting";
        }
    }
    // 一个action（）的示例，它将自己的新对象插入事件列表：
    public class Bell extends Event {
        public Bell(long delayTime) {
            super(delayTime);
        }
        @Override
        public void action() {
            addEvent(new Bell(delayTime.toMillis()));
        }
        @Override
        public String toString() {
            return "Bing!";
        }
    }
    // 一个由 Event 对象组成的数组被递交给 Restart，该数组要加到控制器上。
    // 由于 Restart() 也是一个 Event 对象，所以同样可以将 Restart 对象添加到 Restart.action() 中，以使系统能够有规律地重新启动自己。
    public class Restart extends Event {
        private Event[] eventList;
        public Restart(long delayTime, Event[] eventList) {
            super(delayTime);
            this.eventList = eventList;
            for(Event e : eventList)
                addEvent(e);
        }
        @Override
        public void action() {
            for(Event e : eventList) {
                e.start(); // 重新运行每个事件
                addEvent(e);
            }
            start(); // 重新运行此事件
            addEvent(this);
        }
        @Override
        public String toString() {
            return "Restarting system";
        }
    }
    public static class Terminate extends Event {
        public Terminate(long delayTime) {
            super(delayTime);
        }
        @Override
        public void action() { System.exit(0); }
        @Override
        public String toString() {
            return "Terminating";
        }
    }
}