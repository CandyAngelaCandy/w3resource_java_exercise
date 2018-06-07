package com.twu.DateTime;

import java.util.Calendar;

public class DateTime11 {
    public static void main(String[] args) {
        getDayNumOfMonth();
    }
    public static void getDayNumOfMonth() {
        Calendar cal = Calendar.getInstance();

        System.out.println("The number of days of a month: " + cal.getActualMaximum(Calendar.DAY_OF_MONTH));
    }
}
