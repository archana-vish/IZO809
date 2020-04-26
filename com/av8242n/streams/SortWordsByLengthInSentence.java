package com.av8242n.streams;

import java.util.Comparator;
import java.util.function.Function;
import java.util.regex.Pattern;

public class SortWordsByLengthInSentence {
    public static void main(String[] args) {
        String sentence = "follow your heart but take your brain with you..";
        Comparator<String> comparatorLength = (str1, str2) -> (str1.length() - str2.length());
        Comparator<String> comparatorCase = (str1, str2) -> (str1.compareTo(str2)); // is as good as String::compareTo
        Comparator<String> applyComparators = comparatorLength.thenComparing(String::compareTo);
        Pattern.compile(" ")
                .splitAsStream(sentence)
                .distinct()
                .sorted(applyComparators.reversed())
                .forEach(System.out::println);
    }
}
