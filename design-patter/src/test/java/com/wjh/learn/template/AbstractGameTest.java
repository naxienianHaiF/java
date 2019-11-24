package com.wjh.learn.template;

import org.junit.Test;

/**
 * @author wjh
 * @date 2019/11/21 8:13
 */
public class AbstractGameTest {

    @Test
    public void play() {
        AbstractGame football = new Football();
        AbstractGame basketball = new Basketball();

        football.play();
        basketball.play();
    }
}
