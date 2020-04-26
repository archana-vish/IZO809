package com.av8242n.streams;

import java.util.stream.DoubleStream;

// Push to develop
public class Square {
    public static void main(String[] args) {
       double sum = DoubleStream.of(1.0, 4.0, 9.0)
                .map(i-> Math.sqrt(i))
                .peek(System.out::println)
                .sum();
        System.out.println(sum);
    }
}
