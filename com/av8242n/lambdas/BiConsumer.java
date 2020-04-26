package com.av8242n.lambdas;

public class BiConsumer {
    public static void main(String[] args) {
        java.util.function.BiConsumer<String, String> biConsumer = (a, b) -> {
            System.out.println(a+b);
        };
        biConsumer.accept("hello","world");
    }
}
