package com.wjh.learn.prototype;

import org.junit.Test;

/**
 * @author wjh
 * @date 2019/11/24 20:05
 */
public class PrototypeConstructorTest {

    @Test
    public void constructorTest() {
        PrototypeConstructor constructor = new PrototypeConstructor();
        constructor.setName("lsx");
        constructor.setAge(27);
        constructor.setDeepCopyVaule("cs");
        constructor.setDeepCopyVaule("sh");

        constructor.setShallowCopy("lsx");
        constructor.setShallowCopy("lsx");
        System.out.println("[before clone] " + constructor);

        PrototypeConstructor clone = constructor.clone();

        //update
        constructor.setAge(32);
        constructor.setName("lyf");
        constructor.setShallowCopy("wjh");
        constructor.setDeepCopyVaule("wh");
        System.out.println("[      update] " + constructor);

        System.out.println("[ after clone] " + clone);
    }
}
