package com.av8242n.streams;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OptionalIfPresent {
    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(1, 2, 100, -10, 20);
        //System.out.println(integerStream.max(Integer::compareTo));
        System.out.println("*************************");
        integerStream.max(Integer::compareTo)
                .ifPresent(System.out::println);


    }
}
