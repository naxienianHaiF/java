package com.wjh.learn.singleton;

/**
 * 懒汉模式
 * @author wjh
 * @date 2019/11/10 18:50
 */
public class UnsafeLazySingleton {

    private static UnsafeLazySingleton instance;
    private UnsafeLazySingleton() {

    }

    public static UnsafeLazySingleton getInstance() {
        if (instance == null) {
            instance = new UnsafeLazySingleton();
        }

        return instance;
    }
}
