package com.av8242n.datetime;

import java.time.LocalDate;

public class TestDatePlus180 {

    public static void main(String[] args) {
        LocalDate first = LocalDate.of(2015,1,22);
        System.out.println(first.plusDays(365));
    }
}
