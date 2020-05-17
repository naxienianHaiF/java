package com.wjh.java.foundation.reflect;

/**
 * @author wjh
 * @date 2020/5/17 9:42
 */
public class ReflectPerson {

    public static void main(String[] args) {

        Class<Person> personClass = Person.class;
        ReflectUtil.publicField(personClass);
        System.out.println("========> Class.getDeclaredFields()");
        ReflectUtil.declaredFields(personClass);
    }

}
