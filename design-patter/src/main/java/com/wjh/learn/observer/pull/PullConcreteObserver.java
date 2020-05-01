package com.wjh.learn.observer.pull;

/**
 * @author wjh
 * @date 2020/1/5 13:20
 */
public class PullConcreteObserver implements PullObserver {

    private String name;

    public PullConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void pull(String status) {
        System.out.println("[" + name + "] Observer status is : " + status);
    }
}
