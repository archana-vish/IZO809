package com.av8242n.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
        Predicate<String> testNotNull = (str -> str != null);
        Predicate<String> testNotEmpty = (str -> !str.isEmpty());
        Predicate<String> testNotNullOrEmpty = testNotNull.and(testNotEmpty);

        String test1 = "hello";
        System.out.println(testNotNullOrEmpty.test(test1));

        String test2 = null;
        System.out.println(testNotNullOrEmpty.test(test2));

        String test3 = "";
        System.out.println(testNotNullOrEmpty.test(test3));

        List<String> names = new ArrayList<>();
        names.add("hello"); names.add("world");
        //names.forEach(System.out::println);
        names.removeIf(str -> str.startsWith("h"));
        names.forEach(System.out::println);
    }
}
