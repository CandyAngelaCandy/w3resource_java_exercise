package com.twu.DateTime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.time.YearMonth;
import java.util.Calendar;

public class DateTime10 {
    public static void main(String[] args) {
        getFirstAndLastDayOfMonth();
    }

    public static void getFirstAndLastDayOfMonth() {
        YearMonth ym = YearMonth.of(2018,6);

        String firstDayOfMonth = ym.atDay(1).getDayOfWeek().name();
        String lastDayOfMonth = ym.atEndOfMonth().getDayOfWeek().name();

        System.out.println("The first day of a month: "+firstDayOfMonth);
        System.out.println("The last day of a month: "+lastDayOfMonth);
    }
}
