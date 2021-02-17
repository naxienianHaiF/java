package com.wjh.java.foundation.jvm.classloader;

import java.io.IOException;
import java.io.InputStream;

public class MyClassLoader extends ClassLoader {

    public static void main(String[] args) {
        MyClassLoader myClassLoader = new MyClassLoader();
        try {
            String classPackage = "com.wjh.java.foundation.jvm.classloader.ClassLoadingInit";
            Object obj = myClassLoader.loadClass(classPackage).newInstance();
            System.out.println(obj.getClass());
            System.out.println(obj instanceof com.wjh.java.foundation.jvm.classloader.ClassLoadingInit);

            /**
             * 自定义类加载器对于非public类，加载会报错
             */
            String subClass = "com.wjh.java.foundation.jvm.classloader.SubClass";
            Object subObj = myClassLoader.loadClass(subClass).newInstance();
            System.out.println(subObj.getClass());
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        try {
            String fileName = name.substring(name.lastIndexOf(".") + 1) + ".class";
            InputStream is = getClass().getResourceAsStream(fileName);
            if (is == null) {
                return super.loadClass(name);
            }
            byte[] bytes = new byte[is.available()];
            is.read(bytes);
            return defineClass(name, bytes, 0, bytes.length);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
