package com.av8242n.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class TreeSetToSortChars {

    public static void main(String[] args) {
        String sent = "the quick brown fox jumped over the lazy dog";
        Pattern.compile("\\s")
                .splitAsStream(sent)
                .flatMap(word -> Arrays.stream(word.split("")))
                .distinct()
                .sorted()
                .forEach(System.out::print);


        TreeSet<Character> tSet = new TreeSet<>();
        for (char letter : sent.toCharArray()) {
            tSet.add(letter);
        }

        tSet.stream().forEach(System.out::print);
    }
}
