package com.av8242n.collections;

import java.util.HashMap;

public class TestHashmap {
    public static void main(String[] args) {
        HashMap<Integer, Integer> someMap = new HashMap<>();
        someMap.put(1, 1);
        someMap.put(1,2);
        System.out.println(someMap);

    }
}
