package com.twu.DataTypesExercise;

import java.util.Scanner;

public class DataTypesExercises5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the time zone offset to GMT: ");

        long tzOffset = input.nextLong();

        currentTimeInGMT(tzOffset);
    }

    public static void currentTimeInGMT(long tzOffset) {

        long totalMillseconds = System.currentTimeMillis();

        long totalSeconds = totalMillseconds / 1000;

        long currentSeconds = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;

        long currentMinutes = totalMinutes % 60;

        long tatalHours = totalMinutes / 60;

        long currentHour = (tatalHours + tzOffset) % 24;

        System.out.println("Current time is " + currentHour + ":" + currentMinutes + ":" + currentSeconds);
    }
}
