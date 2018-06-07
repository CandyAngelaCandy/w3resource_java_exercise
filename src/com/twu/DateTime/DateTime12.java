package com.twu.DateTime;

import java.text.DateFormatSymbols;
import java.util.Locale;

public class DateTime12 {
    public static void main(String[] args) {
        getLocalDayInWeekName();
    }

    public static void getLocalDayInWeekName() {

        //Localize in German
        DateFormatSymbols dfs = new DateFormatSymbols(new Locale("de"));

        String[] dayNames = dfs.getWeekdays();

        for (String s: dayNames) {
            System.out.println(s);
        }
    }

}
