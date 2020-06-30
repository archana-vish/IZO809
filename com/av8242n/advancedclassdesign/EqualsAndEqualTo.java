package com.av8242n.advancedclassdesign;

public class EqualsAndEqualTo {
    public static void main(String[] args) {
        String s1 = new String("s1");
        String s2 = new String("s1");
        System.out.println(s1.equals(s2)); //true

        StringBuilder sb1 = new StringBuilder("sb1");
        StringBuilder sb2 = new StringBuilder("sb1");
        System.out.println(sb1.equals(sb2)); //false
        System.out.println(sb1 == sb2); //false

    }
}
