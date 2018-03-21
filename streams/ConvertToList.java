package com.av8242n.streams;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ConvertToList {
    public static void main(String[] args) {
        String sentence = "un:deux:trois:quatre:un";
        Pattern.compile(":")
                .splitAsStream(sentence)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
