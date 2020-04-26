package com.av8242n.generics;

import java.util.ArrayList;
import java.util.List;

public class FillGenericMethod {

    public <T> void fill(List<T> list, T element) {

        System.out.println("Before fill ");

        list.stream()
                .forEach(System.out::println);

        System.out.println("After fill");

        list.stream()
                .map(e -> element)
                .forEach(System.out::println);
    }

    public <T> void genericFill(List<?> list, T element) {

        System.out.println("Before wildcard fill ");

        list.stream()
                .forEach(System.out::println);

        System.out.println("After wildcard fill");

        list.stream()
                .map(e -> element)
                .forEach(System.out::println);
    }


    public static void main(String[] args) {
        FillGenericMethod fillGenericMethod = new FillGenericMethod();

        List<Integer> alNumbers = new ArrayList<>();
        alNumbers.add(10);
        alNumbers.add(20);

        fillGenericMethod.fill(alNumbers, 100);
        fillGenericMethod.genericFill(alNumbers, 100);

        List<String> alString = new ArrayList<>();
        alString.add("a");
        alString.add("b");

        fillGenericMethod.fill(alString, "AAAA");

    }
}
