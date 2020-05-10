package com.av8242n.NumberFormatter;

import java.text.NumberFormat;
import java.util.Locale;

public class FormatNumbers {
    public static void main(String[] args) throws Exception {

        Locale gb = Locale.getDefault();

        NumberFormat nf1 = NumberFormat.getInstance();
        NumberFormat nf2 = NumberFormat.getInstance(gb);

        NumberFormat numberFormat1 = NumberFormat.getNumberInstance();
        NumberFormat numberFormat2 = NumberFormat.getNumberInstance(gb);

        NumberFormat currencyFormat1 = NumberFormat.getCurrencyInstance();
        NumberFormat currencyFormat2 = NumberFormat.getCurrencyInstance(gb);

        NumberFormat percentFormat1 = NumberFormat.getPercentInstance();
        NumberFormat percentFormat2 = NumberFormat.getPercentInstance(gb);

        NumberFormat integerFormat1 = NumberFormat.getIntegerInstance();
        NumberFormat integerFormat2 = NumberFormat.getIntegerInstance(gb);

        String number = "1,000,000";
        String currency = "£1,000";
        String percent = "99.99%";

        System.out.println(numberFormat1.parse(number));
        System.out.println(currencyFormat1.parse(currency));
        System.out.println(percentFormat1.parse(percent));

        double toFormatNumber = 1000000d;
        System.out.println(numberFormat1.format(toFormatNumber));

        int toFormatCurrency = 1000;
        System.out.println(currencyFormat1.format(toFormatCurrency));

        double toFormatPercent = .9999d;
        System.out.println(percentFormat1.format(toFormatPercent));




    }
}
