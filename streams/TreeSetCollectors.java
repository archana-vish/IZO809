package com.av8242n.streams;

import java.util.TreeSet;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class TreeSetCollectors {
    public static void main(String[] args) {
        String sentence = "a rose is a rose is a rose";
        Pattern.compile(" ")
                .splitAsStream(sentence)
                .collect(Collectors.toCollection(TreeSet::new))
                .forEach(System.out::println);
    }
}
