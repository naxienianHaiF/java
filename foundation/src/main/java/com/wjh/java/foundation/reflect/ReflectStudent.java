package com.wjh.java.foundation.reflect;

/**
 * @author wjh
 * @date 2020/5/17 16:24
 */
public class ReflectStudent {

    public static void main(String[] args) {
        Class<Student> studentClass = Student.class;
        ReflectUtil.publicField(studentClass);
        System.out.println("========> Class.getDeclaredFields()");
        ReflectUtil.declaredFields(studentClass);

        Student student = null;
        try {
            student = studentClass.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println(student);

        Person person = new Person();
        System.out.println("Person is " + studentClass.isInstance(person));
        System.out.println("Student is " + person.getClass().isInstance(student));
    }

}
