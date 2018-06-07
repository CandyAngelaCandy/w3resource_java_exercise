package com.twu.DateTime;

import java.time.LocalDateTime;

public class DateTime28 {
    public static void main(String[] args) {
        getInfoOfDateAndTimeBefore();
    }

    public static void getInfoOfDateAndTimeBefore() {
        LocalDateTime currentDateTime = LocalDateTime.now();

        //Before 2 hours and 45 minutes
        LocalDateTime pDateTime = currentDateTime.minusHours(2).minusMinutes(45);

        System.out.println("Current Date and Time:  " +currentDateTime);
        System.out.println("Before 2 hours and 45 minutes: " + pDateTime);

    }
}
