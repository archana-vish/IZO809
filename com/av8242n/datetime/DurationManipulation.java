package com.av8242n.datetime;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DurationManipulation {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime later = now.plusMinutes(30);

        Duration ofDays1 = Duration.of(1, ChronoUnit.DAYS);
        Duration ofDays2 = Duration.ofDays(1);

        Duration ofHours1 = Duration.of(1, ChronoUnit.HOURS);
        Duration ofHours2 = Duration.ofHours(1);

        Duration ofMinutes1 = Duration.of(30, ChronoUnit.MINUTES);
        Duration ofMinutes2 = Duration.ofMinutes(30);

        Duration ofSeconds1 = Duration.of(30, ChronoUnit.SECONDS);
        Duration ofSeconds2 = Duration.ofSeconds(30);

        Duration ofMillis1 = Duration.of(300, ChronoUnit.MILLIS);
        Duration ofMillis2 = Duration.ofMillis(300);

        Duration ofNanos1 = Duration.of(300, ChronoUnit.NANOS);
        Duration ofNanos2 = Duration.ofNanos(300);

        System.out.println( ofDays1 + "<---- Days ---->" + ofDays2);
        System.out.println( ofHours1 + "<---- Hours ---->" + ofHours2);
        System.out.println( ofMinutes1 + "<---- Minutes ---->" + ofMinutes2);
        System.out.println( ofSeconds1 + "<---- Seconds ---->" + ofSeconds2);
        System.out.println( ofMillis1 + "<---- Millis ---->" + ofMillis2);
        System.out.println( ofNanos1 + "<---- Nanos ---->" + ofNanos2);

        System.out.println(now.plus(ofDays1));
        System.out.println(now.plus(ofMillis1));

        System.out.println("Time between now and later :: " + ChronoUnit.MINUTES.between(now, later));
        System.out.println("Time between now and later :: " + Duration.between(now, later));
        System.out.println("Time between now and later :: " + Period.between(now.toLocalDate(), later.toLocalDate()));


    }
}
