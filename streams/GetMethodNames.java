package com.av8242n.streams;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class GetMethodNames {
    public static void main(String[] args) {
        Method[] methods = Stream.class.getMethods();
        Arrays.stream(methods)
                .map(method -> method.getName())
                .sorted()
                .forEach(System.out::println);
    }
}
