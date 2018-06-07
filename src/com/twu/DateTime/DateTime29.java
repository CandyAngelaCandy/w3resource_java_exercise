package com.twu.DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTime29 {
    public static void main(String[] args) {
        stringToDate();
    }

        public static void stringToDate() {
        String str = "June,4,2018";

        DateTimeFormatter formatter = DateTimeFormatter.
                ofPattern("MMMM,d,yyyy",Locale.ENGLISH);
        LocalDate date = LocalDate.parse(str,formatter);

        System.out.println("The date: "+date);
    }
}
