package com.av8242n.lambdas;

import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {
        Function<String, String> functionTest = str -> { return str.toUpperCase();};
        System.out.println(functionTest.apply("Hello World"));

        String longName = "supercalifragilesticexpialidocious";
        Function<String, String> testNotNull = str -> {
            if (str == null)
                return "";
            else
                return str;
        };
        Function<String, Integer> getLength = str -> { return str.length(); };
        Function<String, Integer> getValidLength = testNotNull.andThen(getLength);
        System.out.println(getValidLength.apply("drama"));

        System.out.println(getLength.compose(testNotNull).apply("oiye"));




    }
}
