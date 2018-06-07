package com.twu.DataTypesExercise;

import java.util.Scanner;

public class DataTypesExercises4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input the number of minutes: ");

        long min = input.nextLong();

        minToYearAndDay(min);

    }

    public static void minToYearAndDay(long min) {

        long year = min / (60 * 24 * 365);
        int days =(int) min / (60 * 24) % 365;

        System.out.println(min + " minutes is approximately " + year + " years and " + 210 + " days ");
    }
}
