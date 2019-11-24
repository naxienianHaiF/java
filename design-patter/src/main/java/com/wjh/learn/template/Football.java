package com.wjh.learn.template;

/**
 * football
 * @author wjh
 * @date 2019/11/21 8:09
 */
public class Football extends AbstractGame {
    @Override
    void initGame() {
        System.out.println("布置足球场地...");
    }

    @Override
    void startGame() {
        System.out.println("开始踢足球比赛...");
    }

    @Override
    void endGame() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("90分钟后，比赛结束...");
    }
}
