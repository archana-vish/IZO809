package com.av8242n.lambdas;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class AtomicIntegers {
    public static void main(String[] args) {
        AtomicInteger ai = new AtomicInteger(0);
        Stream.generate(ai :: incrementAndGet)
                .limit(10)
                .forEach(System.out::println);
    }
}
