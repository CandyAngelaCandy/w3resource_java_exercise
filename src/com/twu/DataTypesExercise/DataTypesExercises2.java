package com.twu.DataTypesExercise;

import java.util.Scanner;

public class DataTypesExercises2 {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Input a value for inch: ");
        double fahrenheit = input.nextDouble();

        InchToMeters(fahrenheit);
    }

    public static void InchToMeters(double inch) {
        double meters = inch * 0.0254;
        System.out.println(inch + " inch is " + meters + " meters");
    }
}
