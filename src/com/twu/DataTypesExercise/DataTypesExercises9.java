package com.twu.DataTypesExercise;

import java.util.Map;
import java.util.Scanner;

public class DataTypesExercises9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input 1st integer: ");

        int firstVal = in.nextInt();

        System.out.print("Input 2nd integer: ");

        int secondVal = in.nextInt();

        calculateNum(firstVal, secondVal);
    }

    public static void calculateNum(int firstVal, int secondVal) {
        int sum = firstVal + secondVal;
        int dif = firstVal - secondVal;
        int product = firstVal * secondVal;
        double avg = (firstVal + secondVal) / 2.0;

        int Distance = Math.abs(firstVal - secondVal);
        int max = Math.max(firstVal, secondVal);
        int min = Math.min(firstVal, secondVal);

        System.out.println("Sum of two integers: " + sum);
        System.out.println("Difference of two integers: " + dif);
        System.out.println("Product of two integers: " + product);
        System.out.printf("Average of two integers: %.2f%n" , avg);
        System.out.println("Distance of two integers: " + Distance);
        System.out.println("Max integer: " + max);
        System.out.println("Min integer: " + min);
    }
}
