package com.twu.DateTime;

import java.util.Calendar;

public class DateTime13 {
    public static void main(String[] args) {
        getSpecificDayInWeek();
    }

    public static void getSpecificDayInWeek() {
        Calendar cal = Calendar.getInstance();
        System.out.println("a day of the week: "+cal.get(Calendar.DAY_OF_WEEK));
    }
}
