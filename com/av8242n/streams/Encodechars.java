package com.av8242n.streams;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Encodechars {
    public static void main(String[] args) {
        String locid = "10_0082,10_B004,#SPLUS6AA4F9";

        Predicate<String> testMultipleElements = str -> Integer.parseInt(str) > 1;

        Predicate<String> testContainsSplChar = str -> str.equals(",");

        Function<String, String> getCharsAfterEncode = str -> str.equals(",") ? str : encode(str);


        try {


            String chars = Arrays.stream(locid.split(""))
                    .map(getCharsAfterEncode)
                    .collect(Collectors.joining());

            System.out.println(chars);

        } catch (Exception uce) {

        }
    }


    private static String encode(String c) {

        try {
                return URLEncoder.encode(c, "UTF-8");
        } catch (UnsupportedEncodingException uce) {
            return c;
        }
    }


}
