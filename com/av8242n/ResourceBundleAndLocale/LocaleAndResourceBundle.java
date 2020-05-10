package com.av8242n.ResourceBundleAndLocale;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleAndResourceBundle {

    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        Locale.setDefault(new Locale("fr"));
        ResourceBundle bundle = ResourceBundle.getBundle("resources.Zoo");
        String greetings = bundle.getString("greetings");
        System.out.println(greetings);


        //Precedence
        /**
         * 1. Zoo_en_gb.java
         * 2. Zoo_en_gb.properties
         * 3. Zoo_en.java
         * 4. Zoo_en.properties
         * 5. Zoo.java
         * 6. Zoo.properties
         */



        // Precedence when searching for another local
        // Eg Locale.setDefault("hi")
        // ResourceBundle.getBundle("Zoo","en")

        /**
         * 1. Zoo_en.java
         * 2. Zoo_en.properties
         * 3. Zoo_hi.java
         * 4. Zoo_hi.properties
         * 5. Zoo.java
         * 6. Zoo.properties
         */
    }
}


