package com.wjh.java.foundation.jvm.gc;

public class User {
    private byte[] bs = new byte[200 * 1024];
    private String userId;

    public User(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("now finalize userId = " + userId);
    }
}
