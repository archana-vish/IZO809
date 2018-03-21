package com.av8242n.streams;

import java.util.stream.IntStream;

public class Factorial {
    public static void main(String[] args) {
        int maxNum = 5;
        int fact = IntStream.rangeClosed(1, maxNum)
                .reduce(1, (x,y) -> (x*y));
        System.out.println(fact);

        IntStream.range(1,5)
                .forEach(System.out::println);
    }
}
