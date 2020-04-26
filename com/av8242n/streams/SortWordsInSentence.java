package com.av8242n.streams;

import java.util.regex.Pattern;

public class SortWordsInSentence {
    public static void main(String[] args) {
        String sentence = "Follow your heart but take your brain with you...";
        Pattern.compile(" ")
                .splitAsStream(sentence)
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }
}
