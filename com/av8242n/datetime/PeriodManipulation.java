package com.av8242n.datetime;

import java.time.*;

public class PeriodManipulation {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();

        Period onlyYears1 = Period.ofYears(1);
        Period onlyYears2 = Period.of(1,0,0);
        System.out.println(onlyYears1 + " <--  Years --> " + onlyYears2);

        Period onlyMonths1 = Period.ofMonths(1);
        Period onlyMonths2 = Period.of(0,1,0);
        System.out.println(onlyMonths1 + " <--  Months --> " + onlyMonths2);

        Period onlyWeeks1 = Period.ofWeeks(1);
        Period onlyWeeks2 = Period.of(0,0,7);
        System.out.println(onlyWeeks1 + " <--  Weeks --> " + onlyWeeks2);


        Period onlyDays1 = Period.ofDays(1);
        Period onlyDays2 = Period.of(0,0,1);
        System.out.println(onlyDays1 + " <--  Days --> " + onlyDays2);

        System.out.println(localDateTime.plus(onlyYears1) + " <--- Adding years  ---> " + localDateTime.plus(onlyYears2));
        System.out.println(localDateTime.plus(onlyMonths1) + " <--- Adding months ---> " + localDateTime.plus(onlyMonths2));
        System.out.println(localDateTime.plus(onlyWeeks1) + " <--- Adding weeks  ---> " + localDateTime.plus(onlyWeeks2));
        System.out.println(localDateTime.plus(onlyDays1) + " <--- Adding days   ---> " + localDateTime.plus(onlyDays2));
        System.out.println("Adding all " + localDateTime.plus(Period.of(1,1,1)));


        LocalDate today = LocalDate.now();
        LocalDate tomorrow = today.plusDays(1);
        Period gap = Period.between(tomorrow, today);
        System.out.println(gap);


        LocalTime now = LocalTime.now();
        LocalTime anHourLater = now.plusHours(1);
        Duration timeGap = Duration.between(now, anHourLater);
        System.out.println(timeGap);

    }
}
