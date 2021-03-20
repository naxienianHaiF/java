package com.wjh.java.foundation.jvm.gc;

import java.lang.ref.*;
import java.util.ArrayList;
import java.util.List;

/**
 * vm configuration : -XX:+PrintGC -Xmx4m -Xms4m
 */
public class ReferenceType {
    private static ReferenceQueue<User> rq = new ReferenceQueue<>();
    public static void main(String[] args) {
        testSoftReference();
        System.out.println("=================");
        testWeakReference();
        System.out.println("=================");
        testPhantomReference();
    }

    private static void printQueue(String str) {
        Reference<? extends User> obj = rq.poll();
        while (obj != null) {
            System.out.println("the gc Object reference = " + str + " = " + obj.get());
            obj = rq.poll();
        }
    }

    /**
     * 软引用
     */
    private static void testSoftReference() {
        List<SoftReference<User>> list = new ArrayList<>();
        for (int i = 0;i<10;i++) {
            SoftReference<User> sr = new SoftReference<>(new User("soft " + i), rq);
            System.out.println("now the soft user == " +sr.get());
            list.add(sr);
        }
        System.gc();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        printQueue("SoftReference");
    }

    /**
     * 弱引用
     */
    private static void testWeakReference() {
        List<WeakReference<User>> list = new ArrayList<>();
        for (int i = 0;i<10;i++) {
            WeakReference<User> sr = new WeakReference<>(new User("weak " + i), rq);
            System.out.println("now the soft user == " +sr.get());
            list.add(sr);
        }
        System.gc();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        printQueue("WeakReference");
    }

    /**
     * 虚引用
     */
    private static void testPhantomReference() {
        List<PhantomReference<User>> list = new ArrayList<>();
        for (int i = 0;i<10;i++) {
            PhantomReference<User> sr = new PhantomReference<>(new User("weak " + i), rq);
            System.out.println("now the soft user == " +sr.get());
            list.add(sr);
        }
        System.gc();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        printQueue("PhantomReference");
    }
}
