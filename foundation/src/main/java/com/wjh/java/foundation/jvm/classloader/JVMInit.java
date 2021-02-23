package com.wjh.java.foundation.jvm.classloader;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class JVMInit {

    static int a = 0;
    static int b;
    static Set<String> set = new HashSet<>();
    static JVMInit jvmInit = new JVMInit();
    static int c = 2;
    /**
     * d没有设置值，所以初始化的时候不会执行这条语句
     */
    static int d;
    int e = 0;
    int f;

    private JVMInit() {
        a++;
        b++;
        c++;
        d++;
        e++;
        f++;
        set.add("jvm");
        System.out.println("construct a = " + a + ", b = " + b + ", c = " +
                c + ", d = " + d + ", e = " + e + ", f = " + f + ", set = " +
                set.toString());
    }

    public static JVMInit getInstance() {
        return jvmInit;
    }

    public static void main(String[] args) {
        JVMInit instance = JVMInit.getInstance();
        System.out.format("a = %d%n", JVMInit.a);
        System.out.println(JVMInit.b);
        System.out.println(JVMInit.c);
        System.out.println(JVMInit.d);
        System.out.println(instance.e);
        System.out.println(instance.f);
    }
}
