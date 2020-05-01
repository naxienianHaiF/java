package com.wjh.learn.observer.push;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * subject。定义一个观察者数组，并实现增、删和通知功能
 *
 * @author wjh
 * @date 2020/1/4 20:03
 */
public abstract class Subject {
    private List<Observer> observerList = Collections.synchronizedList(new ArrayList<Observer>());

    /**
     * 增加观察者
     * @param observer 观察者
     * @return true表示添加成功，false表示失败
     */
    public boolean addObserver(Observer observer) {
        return observerList.add(observer);
    }

    /**
     * 移除观察者
     * @param observer 待移除的观察者
     * @return true表示成功  false表示失败
     */
    public boolean removeObserver(Observer observer) {
        return observerList.remove(observer);
    }

    /**
     * 通知所有的观察者
     */
    public void notifyObserver() {
        observerList.forEach(Observer::update);
    }
}
