package com.wjh.java.foundation.jvm.classloader;

public class JVMInitialization {

    public static void main(String[] args) {
        /**
         * 通过子类引用父类的静态字段，不会导致子类初始化
         */
        System.out.println(Sub.value);
        System.out.println("=====数组不会触发初始化====");
        /**
         * 通过数组定义引用类， 不会触发此类的初始化
         */
        Sub[] subs = new Sub[2];
    }
}

class Parent {
    static {
        System.out.println("Parent static code...");
    }
    static int value = 2;
}

class Sub extends Parent {
    static {
        System.out.println("Subclass static code...");
    }
//    static int value = 3;
}
