package com.wjh.learn.observer.pull;

/**
 * @author wjh
 * @date 2020/1/5 13:18
 */
@FunctionalInterface
public interface PullObserver {

    void pull(String status);
}
