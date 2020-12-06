package com.mzl.innerclasses.controller;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName： Controller
 * @Description： 用来管理并触发事件的实际控制框架
 * @author：lhg
 * @data：2020/11/20 14:48
 * @Version：1.0
 * 控制系统的可重用框架
 * Event 对象被保存在 List<Event> 类型（读作“Event 的列表”）的容器对象中，容器会在 集合 中详细介绍。
 * 目前读者只需要知道 add() 方法用来将一个 Event 添加到 List 的尾端，
 * size() 方法用来得到 List 中元素的个数，
 * foreach 语法用来连续获取 List 中的 Event，
 * remove() 方法用来从 List 中移除指定的 Event。
 **/
public class Controller {
    // java.util中的一个类，用于保存事件对象：
    private List<Event> eventList = new ArrayList<>();
    public void addEvent(Event c) { eventList.add(c); }
    // run() 方法循环遍历 eventList，寻找就绪的（ready()）、要运行的 Event 对象。
    public void run() {
        while(eventList.size() > 0)
            // 进行复制，以便在选择列表中的元素时不会修改列表：
            for(Event e : new ArrayList<>(eventList))
                // 对找到的每一个就绪的（ready()）事件，使用对象的 toString() 打印其信息，调用其 action() 方法，然后从列表中移除此 Event。
                if(e.ready()) {
                    System.out.println(e);
                    e.action();
                    eventList.remove(e);
                }
    }
}
