package com.av8242n.streams;

import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitiveOptional {
    public static void main(String[] args) {
        IntStream intStream = IntStream.of(100, 1000, -10, 0, -10000, 10000);
        OptionalInt maxInt = intStream.min();
        //maxInt.isPresent();
        System.out.println(intStream.summaryStatistics()
                );
        //maxInt.ifPresent(System.out::print);
    }
}
