package com.av8242n.datetime;

import java.time.*;

import static java.util.Calendar.MONTH;

public class CreateDateAndTime {

    public static void createDates() {
        LocalDate myBirthday = LocalDate.of(1982, 6, 21);
        LocalDate myBirthdayInMonthsEnum = LocalDate.of(1982, Month.JUNE, 21);
        System.out.println(myBirthday);
        System.out.println(myBirthdayInMonthsEnum);
    }


    public static void createTime() {
        LocalTime myBirthtime = LocalTime.of(13, 26);
        LocalTime myBirthtimeSec = LocalTime.of(13, 26, 20);
        LocalTime myBirthtimeNSec = LocalTime.of(13, 26, 20, 300);

        System.out.println(myBirthtime);
        System.out.println(myBirthtimeSec);
        System.out.println(myBirthtimeNSec);
    }


    public static void createDatesAndTime() {
        LocalDateTime myBirthdayFormat1 = LocalDateTime.of(1982, 6, 21, 13, 26);
        LocalDateTime myBirthdayFormat2 = LocalDateTime.of(1982, 6, 21, 13, 26, 20);
        LocalDateTime myBirthdayFormat3 = LocalDateTime.of(1982, 6, 21, 13, 26, 20, 200);

        LocalDateTime myBirthdayFormat4 = LocalDateTime.of(1982, Month.JUNE, 21, 13, 26);
        LocalDateTime myBirthdayFormat5 = LocalDateTime.of(1982, Month.JUNE, 21, 13, 26, 20);
        LocalDateTime myBirthdayFormat6 = LocalDateTime.of(1982, Month.JUNE, 21, 13, 26, 20, 200);

        LocalDate localDate = LocalDate.of(1982, 6, 21);
        LocalTime localTime = LocalTime.of(13, 26);
        LocalDateTime myBirthdayFormat7 = LocalDateTime.of(localDate, localTime);

        System.out.println(myBirthdayFormat1);
        System.out.println(myBirthdayFormat2);
        System.out.println(myBirthdayFormat3);
        System.out.println(myBirthdayFormat4);
        System.out.println(myBirthdayFormat5);
        System.out.println(myBirthdayFormat6);
        System.out.println(myBirthdayFormat7);
    }

    public static void main(String[] args) {
        CreateDateAndTime.createDates();
        CreateDateAndTime.createTime();
        CreateDateAndTime.createDatesAndTime();
    }
}
