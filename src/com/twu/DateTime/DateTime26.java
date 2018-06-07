package com.twu.DateTime;

import java.time.LocalDate;
import java.time.Month;

public class DateTime26 {
    public static void main(String[] args) {
        getInfoOfCurrentMonth();
    }

    public static void getInfoOfCurrentMonth() {
        LocalDate currentDate = LocalDate.now();
        Month currentMonth = currentDate.getMonth();

        System.out.println("Integer value of the current month: " + currentMonth.getValue());
        System.out.println("Length of the month: " + currentMonth.minLength());
        System.out.println("Maximum length of the month: " + currentMonth.maxLength());
        System.out.println("First month of the Quarter: " + currentMonth.firstMonthOfQuarter());
    }
}

