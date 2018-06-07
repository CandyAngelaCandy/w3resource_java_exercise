package com.twu.DataTypesExercise;

import java.util.Scanner;

public class DataTypesExercises7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input distance in meters: ");
        double distance = input.nextLong();

        System.out.print("Input hour: ");
        int hour = input.nextInt();

        System.out.print("Input minutes: ");
        int minutes = input.nextInt();

        System.out.print("Input seconds: ");
        int seconds = input.nextInt();

        calSpeed(distance, hour, minutes, seconds);
    }

    public static void calSpeed(double distance, int hour, int minutes, int seconds) {

        double tatalSeconds = seconds + minutes * 60 + hour * 60 * 60;

        double metersDivSecond = distance / tatalSeconds;
        double kmDivHour = (distance / 1000.0d) / (tatalSeconds / 3600.0d);
        double milesDivHour = (distance / 1609.0d) / (tatalSeconds / 3600.0d);

        System.out.println("Your speed in meters/second is " + metersDivSecond + "\n" +
                "Your speed in km/h is " + kmDivHour + "\n" +
                "Your speed in miles/h is " + milesDivHour + "\n");
    }
}
