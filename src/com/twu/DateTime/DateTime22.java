package com.twu.DateTime;

import java.time.LocalDate;

public class DateTime22 {
    public static void main(String[] args) {
        getDateBeforeOrIntenDays();
    }

    public static void getDateBeforeOrIntenDays() {
        LocalDate currentDate = LocalDate.now();
        System.out.println("The current Date: "+currentDate);
        System.out.println("The dates before today: "+currentDate.plusDays(-10));
        System.out.println("The dates after today: "+currentDate.plusDays(10));
    }
}
