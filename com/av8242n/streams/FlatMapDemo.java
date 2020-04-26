package com.av8242n.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FlatMapDemo {
    public static void main(String[] args) {
        IntStream intStream = IntStream.of(1,2,3,4,5);
        intStream
                .map(i -> i*i)
                .forEach(System.out::println);
        System.out.println("*********");
        List<Integer> listOne = Arrays.asList(new Integer[]{1,2,3});
        List<Integer> listTwo = Arrays.asList(new Integer[] {4,5});
        List<List<Integer>> megaList = Arrays.asList(listOne, listTwo);
        megaList.stream()
                .flatMap(list -> list.stream())
                .map(num -> num * num)
                .forEach(System.out::println);


    }
}
