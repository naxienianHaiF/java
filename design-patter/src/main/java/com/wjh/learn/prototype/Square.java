package com.wjh.learn.prototype;

/**
 * @author wjh
 * @date 2019/11/22 8:04
 */
public class Square extends Shape{

    public Square() {
        System.out.println("Square constructor method...");
        type = "square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
