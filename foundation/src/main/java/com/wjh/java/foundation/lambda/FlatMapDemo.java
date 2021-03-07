package com.wjh.java.foundation.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * flatMap方法把一个流中的每一个值换成另一个流，然后把所有的流连接起来成为一个流。
 */
public class FlatMapDemo {
    public static void main(String[] args) {
        test1();
        test2();
        test3();
    }

    private static void test2() {
        System.out.println("======method test2()");
        List<String> list = new ArrayList<>();
        list.add("tom");
        list.add("tony");
        Stream<String> stream = list.stream();
        Stream<String[]> stream1 = stream.map(s -> s.split(""));
        Stream<String> stringStream = stream1.flatMap(Arrays::stream);
        stringStream.forEach(e -> System.out.print(e + " "));
        System.out.println();
    }

    private static void test1() {
        System.out.println("======method test1()");
        List<String> list = new ArrayList<>();
        list.add("tom");
        list.add("tony");
        Stream<String> stream = list.stream();
        Stream<String[]> stream1 = stream.map(s -> s.split(""));
        Stream<Stream<String>> streamStream = stream1.map(Arrays::stream);
        streamStream.forEach(e -> {
            e.forEach(s -> System.out.print(s + " "));
        });
        System.out.println();
    }

    private static void test3() {
        System.out.println("======method test3()");
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(3, 4);

        List<Integer[]> collect = list1.stream().flatMap(x -> list2.stream()
                .map(y -> new Integer[]{x, y}))
                .collect(Collectors.toList());
        collect.stream().map(Arrays::asList).forEach(System.out::println);
    }
}
