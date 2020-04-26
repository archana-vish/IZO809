package com.av8242n.lambdas;

import java.util.function.BiFunction;

public class BiFunctionTest {

    public static void main(String[] args) {
        BiFunction<String, String, String> biFunction = (a, b) -> { return a.concat(b);};
        System.out.println(biFunction.apply("hello", "world"));
    }
}
