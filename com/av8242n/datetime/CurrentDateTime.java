package com.av8242n.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;

public class CurrentDateTime {

    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        LocalDateTime currentDateAndTime = LocalDateTime.now();
        ZonedDateTime currentDateAndTimeInTimeZone = ZonedDateTime.now();

        System.out.println("Current Date :: " + currentDate);
        System.out.println("Current Time :: " + currentTime);
        System.out.println("Current Date and Time :: " + currentDateAndTime);
        System.out.println("Current Date and Time in our timezone :: " + currentDateAndTimeInTimeZone);


    }
}
