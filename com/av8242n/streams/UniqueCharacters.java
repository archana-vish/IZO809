package com.av8242n.streams;

import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class UniqueCharacters {
    public static void main(String[] args) {
        String sentence = "you never know what you have unless you clean your room";
        Stream<String> distinctSortedStream =
                Pattern.compile(" ")
                        .splitAsStream(sentence)
                        .distinct()
                        .sorted();
        distinctSortedStream
                .flatMap(word -> Arrays.stream(word.split("")))
                .distinct()
                .forEach(System.out::print);

        "abracadabra".chars().distinct().peek(ch -> System.out.printf("%c ", ch)).sorted()
        .forEach(System.out::println);
    }
}
