package com.twu.DataTypesExercise;

import java.util.Scanner;

public class DataTypesExercises8 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input the value: ");

        double num = in.nextDouble();

        calNum(num);
    }
    public static void calNum(double num){

        System.out.printf("Square: %10.2f\n", num * num);
        System.out.printf("Cube: %10.2f\n", num * num * num);
        System.out.printf("Fourth power: %10.2f\n", Math.pow(num, 4));

    }
}
