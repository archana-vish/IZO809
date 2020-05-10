package com.av8242n.datetime.resources;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleAndResourceBundle {

    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        Locale.setDefault(new Locale("fr"));
        ResourceBundle bundle = ResourceBundle.getBundle("resources.Zoo");
        String greetings = bundle.getString("greetings");
        System.out.println(greetings);
    }
}


