package com.av8242n.generics;

public class MyMap<T,V> {
    T key;
    V value;

    MyMap(T t, V v) {
        this.key = t;
        this.value = v;
    }

    void getMapValues() {
        System.out.println("Key is :: " + key);
        System.out.println("Value is :: " + value);
    }


    public static void main(String[] args) {
        MyMap<String, Integer> myMap1 = new MyMap<>("Integer", 10);
        myMap1.getMapValues();

        MyMap<String, String> myMap2 = new MyMap<>("a", "A");
        myMap2.getMapValues();
    }
}
