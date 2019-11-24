package com.wjh.learn.template;

/**
 * <p>template design. {@link java.util.concurrent.locks.AbstractQueuedSynchronizer}</p>
 * @author wjh
 * @date 2019/11/21 8:06
 */
public abstract class AbstractGame {
    /**
     * 初始化游戏
     */
    protected abstract void initGame();
    protected abstract void startGame();
    protected abstract void endGame();

    /**
     * 玩游戏
     */
    public final void play() {
        this.initGame();
        this.startGame();
        this.endGame();
    }
}
