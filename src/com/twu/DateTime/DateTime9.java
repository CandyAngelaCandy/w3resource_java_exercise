package com.twu.DateTime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateTime9 {
    public static void main(String[] args) {
        getFirstAndLastDayOfEachWeek();
    }

    public static void getFirstAndLastDayOfEachWeek() {
        Calendar cal = Calendar.getInstance();

        cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

        DateFormat df = new SimpleDateFormat("yyyy/MM/dd EEE");

        System.out.println();
        System.out.println("The first day of each week: "+df.format(cal.getTime()));

        cal.add(Calendar.DATE, 6);
        System.out.println("The last day of each week: "+df.format(cal.getTime()));

    }
}
