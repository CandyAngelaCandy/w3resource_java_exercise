package com.twu.DateTime;

import java.time.LocalTime;
import java.util.Calendar;

public class DateTime15 {
    public static void main(String[] args) {
        addHoursToCurrentTime();
    }

    public static void addHoursToCurrentTime() {
        LocalTime time = LocalTime.now();

        LocalTime addHourTime = time.plusHours(1);

        System.out.println("Time after 1 hour: "+addHourTime);

    }
}
