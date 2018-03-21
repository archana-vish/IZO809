package com.av8242n.generics;

import javafx.util.Pair;

public class PairOff<T> {

    T key;
    T value;

    PairOff(T key, T value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Key is ["+ this.key + "] and value :: " + this.value;
    }

    public static void main(String[] args) {
        PairOff<String> pairOff1 = new PairOff<>("A", "a");
        System.out.println(pairOff1);

        PairOff<Integer> pairOff2 = new PairOff<>(10,100);
        System.out.println(pairOff2);
    }
}
