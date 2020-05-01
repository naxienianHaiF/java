package com.wjh.learn.observer.push;

/**
 * @author wjh
 * @date 2020/1/4 21:01
 */
public class Client {

    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Observer observer = new ConcreteObserver();
        subject.addObserver(observer);

        subject.notifyObserver();
    }
}
