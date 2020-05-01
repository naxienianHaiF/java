package com.wjh.learn.chain;

/**
 * 定义链式处理
 * @author wjh
 * @date 2019/12/15 15:23
 */
public class Client {

    public static void main(String[] args) {
        Handler father = new Father();
        Handler father1 = new Father();
        Handler son = new Son();
        father.setSuccessor(son);

        father.handleReques();
        father1.handleReques();
    }

}
