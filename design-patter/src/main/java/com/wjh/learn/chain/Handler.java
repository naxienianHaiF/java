package com.wjh.learn.chain;

/**
 * chain of Responsibility
 * @author wjh
 * @date 2019/12/15 14:53
 */
public abstract class Handler {

    /**
     * 后继处理者
     */
    protected Handler successor;

    public final void handleReques() {
        if (this.getSuccessor() != null) {
            this.getSuccessor().handleReques();
        } else {
            System.out.println(this.getClass().getName() + " handle request...");
        }
    }

    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
}
