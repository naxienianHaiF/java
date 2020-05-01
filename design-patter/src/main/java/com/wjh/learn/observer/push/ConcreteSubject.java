package com.wjh.learn.observer.push;

/**
 * @author wjh
 * @date 2020/1/4 20:44
 */
public class ConcreteSubject extends Subject {

    @Override
    public void notifyObserver() {
        System.out.println("===>正在通知消费者...");
        super.notifyObserver();
        System.out.println("===>通知完消费者...");
    }
}
