package com.twu.DateTime;

import java.time.LocalDate;
import java.time.Period;

public class DateTime30 {
    public static void main(String[] args) {
        calDiffBetweenTwoDates();
    }

    public static void calDiffBetweenTwoDates() {
        LocalDate currentDate = LocalDate.now();
        LocalDate userDate = LocalDate.of(2011,9,6);
        Period period = Period.between(userDate,currentDate);

        System.out.println("The difference between "+currentDate+" and "+userDate+" is: "
        +period.getYears()+" years "+period.getMonths()+" months "+period.getDays()+" days");
    }
}
