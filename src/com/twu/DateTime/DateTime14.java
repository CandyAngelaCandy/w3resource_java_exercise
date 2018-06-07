package com.twu.DateTime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Calendar;

public class DateTime14 {
    public static void main(String[] args) {
        getCurrentLocalTime();
    }

    public static void getCurrentLocalTime() {
        LocalTime time = LocalTime.now();

        System.out.println("The current local time: "+time);
    }
}
