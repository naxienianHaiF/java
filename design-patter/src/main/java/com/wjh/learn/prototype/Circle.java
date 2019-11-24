package com.wjh.learn.prototype;

/**
 * @author wjh
 * @date 2019/11/22 8:05
 */
public class Circle extends Shape {
    public Circle() {
        System.out.println("Circle constructor method...");
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
