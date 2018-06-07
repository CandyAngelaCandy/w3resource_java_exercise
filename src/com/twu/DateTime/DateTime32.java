package com.twu.DateTime;

import java.time.LocalDate;
import java.time.Period;

public class DateTime32 {

    public static void main(String[] args) {
        calAge();
    }

    public static void calAge() {
        LocalDate currentDate = LocalDate.now();
        LocalDate userDate = LocalDate.of(1992,8,14);

        Period period = Period.between(userDate,currentDate);

        System.out.println("my age: "+period.getYears()+" years "+
        period.getMonths()+" months "+period.getDays() +" days");
    }
}
