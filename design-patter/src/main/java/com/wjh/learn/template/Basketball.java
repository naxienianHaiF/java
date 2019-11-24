package com.wjh.learn.template;

/**
 * basketball
 * @author wjh
 * @date 2019/11/21 8:11
 */
public class Basketball extends AbstractGame {
    @Override
    void initGame() {
        System.out.println("开始检查篮球场...");
    }

    @Override
    void startGame() {
        System.out.println("篮球比赛开始...");
    }

    @Override
    void endGame() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("篮球比赛结束，中国队16强...");
    }
}
