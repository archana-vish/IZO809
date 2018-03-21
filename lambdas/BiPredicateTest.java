package com.av8242n.lambdas;

import java.util.function.BiPredicate;

public class BiPredicateTest {

    public static void main(String[] args) {
        BiPredicate<String, String> biPredicate = (a, b) -> { return a.contains(b);};
        System.out.println(biPredicate.test("helloworld","lowo"));
    }
}
