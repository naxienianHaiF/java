package com.wjh.java.foundation.reflect;

/**
 * @author wjh
 * @date 2020/5/17 9:40
 */
public class Person {
    @SuppressWarnings("unused")
    public static final String DATE = "20200517";
    @SuppressWarnings("unused")
    protected static String  user = "lsx";
    @SuppressWarnings("unused")
    private static String password = "0303";

    private String name;
    public int age;
    String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
