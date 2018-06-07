package com.twu.DateTime;

import java.util.Calendar;
import java.util.TimeZone;

public class DateTime5 {
    public static void main(String[] args) {
        getNewYorkTime();
    }

    public static void getNewYorkTime() {
        Calendar calNewYork = Calendar.getInstance();
        calNewYork.setTimeZone(TimeZone.getTimeZone("America/New_York"));
        System.out.println("Time in New York: " + calNewYork.get(Calendar.HOUR_OF_DAY) + ":" +
                calNewYork.get(Calendar.MINUTE) + ":" + calNewYork.get(Calendar.SECOND));
    }
}
