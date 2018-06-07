package com.twu.DateTime;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class DateTime23 {
    public static void main(String[] args) {
        getRemainingMonths();
    }

    public static void getRemainingMonths() {

        LocalDate currentDate = LocalDate.now();
        LocalDate lastDayOfYear = currentDate.with(TemporalAdjusters.lastDayOfYear());
        Period period = currentDate.until(lastDayOfYear);

        System.out.println("The months remaining in the year: " + period.getMonths());

    }
}
