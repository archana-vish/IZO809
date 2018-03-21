package com.av8242n.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {

    public static void main(String[] args) {
        Consumer<String> consumerTest = str ->
            System.out.println(str.toUpperCase());
        consumerTest.accept("hello world");

        List<String> names = Arrays.asList(new String[]{"hello","world"});
        names.forEach(consumerTest::accept);
    }
}
