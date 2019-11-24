package com.wjh.learn.singleton;

/**
 * voliate 修饰变量，禁止指令重排序
 * @author wjh
 * @date 2019/11/10 20:27
 */
public class VolatileLazySingleton {
    private static volatile VolatileLazySingleton instance;
    private VolatileLazySingleton() {

    }

    /**
     * 第一个if判断是为了减少加锁的次数，第二个if是第一次多个线程同时调用的时候判断条件
     * @return instance
     */
    public static VolatileLazySingleton getInstance() {
        if (instance == null) {
            synchronized (VolatileLazySingleton.class) {
                if (instance == null) {
                    instance = new VolatileLazySingleton();
                }
            }
        }
        return instance;
    }
}
