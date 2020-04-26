package com.av8242n.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PartitioningByUsingStreams {
    public static void main(String[] args) {
        String sentence = "you never know what you have unless you clean your room";
        Comparator<String> compareByLength = (str1, str2) -> (str1.length() - str2.length());
        Stream<String> distinctSortedByLengthStream =
                Pattern.compile(" ")
                        .splitAsStream(sentence)
                        .distinct()
                        .sorted(compareByLength);
        //distinctSortedByLengthStream.forEach(System.out::println);
        Map<Boolean, List<String>> mapOfStringByLength =
        distinctSortedByLengthStream.collect(Collectors.partitioningBy(str1 -> (str1.length() > 3)));

        mapOfStringByLength.forEach((cond, words) -> {
            System.out.println("Words with length > 3? as :: " + cond + " are " + words);
        });

    }
}
