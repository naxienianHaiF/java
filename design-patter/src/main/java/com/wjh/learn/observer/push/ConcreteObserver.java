package com.wjh.learn.observer.push;

/**
 * @author wjh
 * @date 2020/1/4 20:42
 */
public class ConcreteObserver implements Observer {
    @Override
    public void update() {
        System.out.println("收到生产者发送过来的消息");
    }
}
