package com.twu.DateTime;

import java.util.Calendar;

public class DateTime18 {
    public static void main(String[] args) {
        IsLeapYear();
    }

    public static void IsLeapYear() {
        Calendar cal = Calendar.getInstance();

        int year = cal.get(Calendar.YEAR);

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("This year is a leap year");
        } else {
            System.out.println("This year is not a leap year");
        }
    }
}
