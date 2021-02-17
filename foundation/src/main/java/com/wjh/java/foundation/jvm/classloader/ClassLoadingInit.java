package com.wjh.java.foundation.jvm.classloader;

/**
 * 类加载
 * @author WJH
 * @date 2020/12/27
 */
public class ClassLoadingInit {
    public static void main(String[] args) {
        test1();
        test2();
        test3();
    }

    /**
     * 对于静态字段，只有<strong>直接定义这个字段</strong>的类才会被初始化，因此通过其子类来引用父类中定义的
     * 静态字段，只会触发父类的初始化而不会触发子类的加载和验证阶段
     */
    private static void test1() {
        System.out.println("--static value--");
        System.out.println(SubClass.value);
    }

    private static void test3() {
        System.out.println("--get static value--");
        System.out.println(SubClass.getValue());
    }

    /**
     * 类常量，已在编译期把结果放入常量池，直接访问不会触发类的初始化。</br>
     * 遇到new、getstatic、putstatic或invokestatic四条字节码指令时，如果类型没有进行过初始化，
     * 则需要先触发其初始化阶段。
     */
    private static void test2() {
        System.out.println("--final value--");
        System.out.println(SubClass.VALUE);
        System.out.println("--get final value--");
        System.out.println(SubClass.getVALUE());
    }
}

class SuperClass {
    static {
        System.out.println("SuperClass init!");
    }

    public static int value = 123;
    public final static int VALUE = 234;

    public static int getValue() {
        return value;
    }

    public static int getVALUE() {
        return VALUE;
    }
}

class SubClass extends SuperClass {
    static {
        System.out.println("SubClass init!");
    }

}
