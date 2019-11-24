package com.wjh.learn.factory;

/**
 * factory
 * @author wjh
 * @date 2019/11/17 19:41
 */
public class PersonFactory {

    /**
     * create person by factory
     * @param c T class instance
     * @param <T> extends {@link Person}
     * @return T instance
     */
    public static <T extends Person> T getInstance(Class<T> c) {
        try {
//            return Class.forName(c.getName()).newInstance();
            return c.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return null;
    }
}
