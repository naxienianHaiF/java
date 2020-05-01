package com.wjh.learn.observer.pull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * pull observer subject
 * @author wjh
 * @date 2020/1/5 13:19
 */
public abstract class PullSubject {
    private List<PullObserver> list = Collections.synchronizedList(new ArrayList<>());

    public boolean addObserver(PullObserver observer) {
        return list.add( observer);
    }

    public boolean remove(PullObserver observer) {
        return list.remove(observer);
    }

    protected void notifyObserver(String status) {
        list.forEach(e -> e.pull(status));
    }

    public int size() {
        return this.list.size();
    }

    /**
     * Subject status
     * @return
     */
    protected abstract String getStatus();

    /**
     * change subject status
     * @param status
     */
    protected abstract void change(String status);
}
