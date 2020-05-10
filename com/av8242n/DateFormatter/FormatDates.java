package com.av8242n.DateFormatter;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormatDates {

    public static void main(String[] args) {
        DateTimeFormatter shortDateTimeFormatter  = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        DateTimeFormatter mediumDateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);

        DateTimeFormatter shortDateFormatter  = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        DateTimeFormatter mediumDateFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);

        DateTimeFormatter shortTimeFormatter  = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        DateTimeFormatter mediumTimeFormatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);

        LocalDate localDate = LocalDate.of(2020, 06, 21);
        LocalTime localTime = LocalTime.of(13, 26);
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);

        System.out.println(shortDateTimeFormatter.format(localDateTime));
        System.out.println(mediumDateTimeFormatter.format(localDateTime));


        System.out.println(shortDateFormatter.format(localDate));
        System.out.println(mediumDateFormatter.format(localDate));
        System.out.println(shortDateFormatter.format(localDateTime));
        System.out.println(mediumDateFormatter.format(localDateTime));


        System.out.println(shortTimeFormatter.format(localTime));
        System.out.println(mediumTimeFormatter.format(localTime));
        System.out.println(shortTimeFormatter.format(localDateTime));
        System.out.println(mediumTimeFormatter.format(localDateTime));


         // System.out.println(shortDateTimeFormatter.format(localDate)); <- when formatter uses both parts, the argument has to have both parts
    }
}
