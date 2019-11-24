package com.wjh.learn.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * prototype clone not execut Constructor method ... <br />
 *
 * @author wjh
 * @date 2019/11/24 20:03
 */
public class PrototypeConstructor implements Cloneable{

    private int age = 18;
    private String name;
    private ArrayList<String> deepCopy = new ArrayList<>();
    private ArrayList<String> shallowCopy = new ArrayList<>();

    @Override
    protected PrototypeConstructor clone() {
        PrototypeConstructor object = null;
        try {
            object = (PrototypeConstructor) super.clone();
            object.deepCopy = (ArrayList<String>) deepCopy.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return object;
    }

    public PrototypeConstructor() {
        System.out.println("Prototype constructor method...");
    }

    public PrototypeConstructor(int age, String name, ArrayList<String> address) {
        this.age = age;
        this.name = name;
        this.deepCopy = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getDeepCopy() {
        return deepCopy;
    }

    public void setDeepCopyVaule(String deepCopyVaule) {
        this.deepCopy.add(deepCopyVaule);
    }

    public ArrayList<String> getShallowCopy() {
        return shallowCopy;
    }

    public void setShallowCopy(String shallowCopyValue) {
        this.shallowCopy.add(shallowCopyValue);
    }

    @Override
    public String toString() {
        return "PrototypeConstructor{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", deepCopy=" + deepCopy +
                ", shallowCopy=" + shallowCopy +
                '}';
    }
}
