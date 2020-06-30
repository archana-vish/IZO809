package com.av8242n.ResourceBundleAndLocale;

import java.util.Locale;
import java.util.ResourceBundle;

public class WhichPropertyFile {
    public static void main(String[] args) {
        Locale fr = new Locale("fr");
        Locale.setDefault(new Locale("en"));
        ResourceBundle resourceBundle = ResourceBundle.getBundle("Zoo", fr);
        System.out.println(resourceBundle.getString("name"));
        System.out.println(resourceBundle.getString("age"));
    }
}
