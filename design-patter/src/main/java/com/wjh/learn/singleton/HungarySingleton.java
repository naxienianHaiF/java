package com.wjh.learn.singleton;

/**
 * 饿汉模式
 * @author wjh
 * @date 2019/11/10 18:42
 */
public class HungarySingleton {

    private HungarySingleton() {

    }

    private static final HungarySingleton instance = new HungarySingleton();

    public static HungarySingleton getInstance() {
        return instance;
    }
}
