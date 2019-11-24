package com.wjh.learn.factory;

/**
 * factory test
 * @author wjh
 * @date 2019/11/17 20:02
 */
public class FactoryTest {

    public static void main(String[] args) {
        Chinese instance = PersonFactory.getInstance(Chinese.class);
        instance.color();
    }
}
