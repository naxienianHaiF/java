package com.wjh.learn.prototype;

/**
 * @author wjh
 * @date 2019/11/22 8:01
 */
public class Rectangle extends Shape {
    public Rectangle() {
        System.out.println("Rectangle constructor method...");
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
