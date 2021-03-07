package com.wjh.java.foundation.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * 短路
 */
public class MatchDemo {

    private static List<String> list = new ArrayList<>();
    static {
        list.add("123");
        list.add("234");
        list.add("345");
        list.add("123");
        list.add("wjh");
        list.add("wjhdemo");

    }
    public static void main(String[] args) {
        allMatch();
        anyMatch();
        noneMatch();
    }

    private static void allMatch() {
        System.out.println("=======allMatch()======");
        boolean allMatch = list.stream().allMatch(e -> e.length() > 2);
        System.out.println("list allMatch() element length > 2 == " + allMatch);
    }

    private static void anyMatch() {
        System.out.println("=======anyMatch()======");
        boolean anyMatch = list.stream().anyMatch(e -> e.contains("wjh"));
        System.out.println("list anyMatch() contains wjh == " + anyMatch);
    }

    private static void noneMatch() {
        System.out.println("=======noneMatch()======");
        boolean noneMatch = list.stream().noneMatch(e -> e.contains("wjh"));
        System.out.println("list noneMatch() none match wjh == " + noneMatch);
    }
}
