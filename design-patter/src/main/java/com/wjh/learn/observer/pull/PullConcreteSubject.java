package com.wjh.learn.observer.pull;

/**
 * @author wjh
 * @date 2020/1/5 13:29
 */
public class PullConcreteSubject extends PullSubject {
    private String status;

    @Override
    protected String getStatus() {
        return this.status;
    }

    @Override
    public void change(String status) {
        this.status = status;
        System.out.println("Subject new status is: " + status);
        System.out.println("Now, notice all observer...");
        this.notifyObserver(status);
    }
}
