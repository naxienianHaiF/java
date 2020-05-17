package com.wjh.java.foundation.reflect;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @author wjh
 * @date 2020/5/17 16:29
 */
public class ReflectUtil {

    public static void print(Field[] fields) {
        for (Field field : fields) {
            int modifiers = field.getModifiers();
            String name = field.getName();
            String type = field.getType().getName();
            Annotation[] annotations = field.getAnnotations();
            System.out.println(Modifier.toString(modifiers) + " "
                    + type + " " + name);
            if (annotations != null && annotations.length > 0) {
                for (Annotation annotation : annotations) {
                    Class<? extends Annotation> annotationType = annotation.annotationType();
                    System.out.println("@" + annotationType);
                }
            }
        }
    }

    /**
     * {@link Class#getFields()} 获取所有Field属性，包括静态变量和父类public属性
     * @param object
     */
    public static void publicField(Class<?> object) {
        System.out.println(object.getName());

        //获取所有 public 访问权限的成员变量
        Field[] fields = object.getFields();
        ReflectUtil.print(fields);
    }

    /**
     * {@link Class#getDeclaredFields()}获取类的所有成员属性，包括静态变量，但不包括父类属性
     * @param object
     */
    public static void declaredFields(Class<?> object) {
        Field[] fields = object.getDeclaredFields();
        ReflectUtil.print(fields);
    }

    private static void method(Class<?> object) {
        for (Method method : object.getMethods()) {
            String name = method.getName();
            String returnType = method.getReturnType().toString();
        }
    }
}
