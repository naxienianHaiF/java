package com.wjh.java.foundation.jvm.classloader;

/**
 * 类加载
 * @author WJH
 * @date 2020/12/27
 */
public class ClassLoadingInit {
    public static void main(String[] args) {
        test1();
    }

    /**
     * 对于静态字段，只有<strong>直接定义这个字段</strong>的类才会被初始化，因此通过其子类来引用父类中定义的
     * 静态字段，只会触发父类的初始化而不会触发子类的加载和验证阶段
     */
    private static void test1() {
        System.out.println(SubClass.value);
    }
}

class SuperClass {
    static {
        System.out.println("SuperClass init!");
    }

    public static int value = 123;
}

class SubClass extends SuperClass {
    static {
        System.out.println("SubClass init!");
    }

}
