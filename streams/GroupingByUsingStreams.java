package com.av8242n.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingByUsingStreams {
    public static void main(String[] args) {
        String sentence = "you never know what you have unless you clean your room";
        Comparator<String> compareByLength = (str1, str2) -> (str1.length() - str2.length());
        Stream<String> sentenceStreamDistinctAndSortedByLength =
                Pattern.compile(" ")
                        .splitAsStream(sentence)
                        .distinct()
                        .sorted(compareByLength);
        //sentenceStreamDistinctAndSortedByLength.forEach(System.out::println);
        Map<Integer, List<String>> mapOfLengthAndList =
                sentenceStreamDistinctAndSortedByLength.collect(Collectors.groupingBy(String::length));
        mapOfLengthAndList.forEach(
                (len, list) -> {
                    System.out.println("Words with length :: " + len);
                    list.forEach(System.out::println);
                }
        );

    }
}
