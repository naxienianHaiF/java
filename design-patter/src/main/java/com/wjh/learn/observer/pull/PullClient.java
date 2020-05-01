package com.wjh.learn.observer.pull;

/**
 * pull model test
 * @author wjh
 * @date 2020/1/5 13:31
 */
public class PullClient {

    public static void main(String[] args) {
        PullSubject subject = new PullConcreteSubject();
        PullObserver observer = new PullConcreteObserver("张三");
        PullObserver observer1 = new PullConcreteObserver("李四");
        PullObserver observer2 = new PullConcreteObserver("王五");

        subject.addObserver(observer);
        subject.addObserver(observer1);
        subject.addObserver(observer2);
        subject.remove(observer1);

        subject.change("new status");
    }
}
