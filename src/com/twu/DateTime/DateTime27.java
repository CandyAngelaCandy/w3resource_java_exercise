package com.twu.DateTime;

import java.time.LocalTime;

public class DateTime27 {
    public static void main(String[] args) {
        getInfoOfGivenTime();
    }

    public static void getInfoOfGivenTime() {
        LocalTime time = LocalTime.of(17,13,40);

        System.out.println("Current Local time: " + time);
        System.out.println("Hour: " + time.getHour());
        System.out.println("Minute: " + time.getMinute());
        System.out.println("Second: " + time.getSecond());
    }
}
