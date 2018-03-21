package com.av8242n.collections;

import java.util.Arrays;
import java.util.List;

public class ArraysAsList {

    public static void main(String[] args) {
        String[] names = new String[]{"Java", "Kotlin","Groovy"};
        List<String> namesAsList = Arrays.asList(names);
        namesAsList.set(2, "JS"); //ok
        namesAsList.add("Groovy"); //not ok
        namesAsList.stream().forEach(System.out::println);
    }
}
