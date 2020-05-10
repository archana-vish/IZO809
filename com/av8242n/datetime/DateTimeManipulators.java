package com.av8242n.datetime;

import java.time.LocalDateTime;

public class DateTimeManipulators {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime + " Plus years  :: " + localDateTime.plusYears(1));
        System.out.println(localDateTime + " Minus years :: " + localDateTime.minusYears(1));
        System.out.println(localDateTime + " Plus months :: " + localDateTime.plusMonths(1));
        System.out.println(localDateTime + " Minus months :: " + localDateTime.minusMonths(1));
        System.out.println(localDateTime + " Plus weeks :: " + localDateTime.plusWeeks(1));
        System.out.println(localDateTime + " Minus weeks :: " + localDateTime.minusWeeks(1));
        System.out.println(localDateTime + " Plus days :: " + localDateTime.plusDays(1));
        System.out.println(localDateTime + " Minus days :: " + localDateTime.minusDays(1));

        System.out.println(localDateTime + " Plus hours :: " + localDateTime.plusHours(1));
        System.out.println(localDateTime + " Minus hours :: " + localDateTime.minusHours(1));
        System.out.println(localDateTime + " Plus minutes :: " + localDateTime.plusMinutes(1));
        System.out.println(localDateTime + " Minus minutes :: " + localDateTime.minusMinutes(1));
        System.out.println(localDateTime + " Plus seconds :: " + localDateTime.plusSeconds(1));
        System.out.println(localDateTime + " Minus seconds :: " + localDateTime.minusSeconds(1));
        System.out.println(localDateTime + " Plus nanos :: " + localDateTime.plusNanos(1));
        System.out.println(localDateTime + " Minus nanos :: " + localDateTime.minusNanos(1));

    }
}
