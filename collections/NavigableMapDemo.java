package com.av8242n.collections;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapDemo {
    public static void main(String[] args) {
        NavigableMap<Integer, String> scores = new TreeMap<>();

        scores.put(50, "A");
        scores.put(70, "B");
        scores.put(100, "C");
        scores.put(20, "D");

        System.out.println(scores.descendingMap());
        System.out.println(scores.firstEntry());
        System.out.println(scores.tailMap(20));

    }
}
