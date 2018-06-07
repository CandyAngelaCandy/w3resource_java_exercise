package com.twu.DateTime;

import java.util.Calendar;

public class DateTime7 {
    public static void main(String[] args) {
        getLastdayOfCurrentMonth();
    }

    public static void getLastdayOfCurrentMonth(){
        Calendar cal = Calendar.getInstance();

        System.out.println("The last day of the current month: "+cal.getActualMaximum(Calendar.DAY_OF_MONTH));
    }

}
