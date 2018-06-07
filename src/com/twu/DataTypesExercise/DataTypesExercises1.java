package com.twu.DataTypesExercise;

import java.util.Scanner;

public class DataTypesExercises1 {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Input a degree in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        FahrenheitToCelsius(fahrenheit);
    }

    public static void FahrenheitToCelsius(double FahDegree) {
        double CelDegree = (FahDegree - 32) / 1.8;
        System.out.println(FahDegree + " degree Fahrenheit is equal to " + CelDegree + " in Celsius");
    }
}
