package com.twu.DataTypesExercise;

import java.util.Scanner;

public class DataTypesExercises3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input an integer between 0 and 1000: ");

        int num = input.nextInt();

        calAllDigits(num);

    }

    public static void calAllDigits(int num) {
        int sum = 0;

        while (num / 10 != 0) {
            sum += num % 10;
            num = num / 10;
        }

        sum += num % 10;

        System.out.println("The sum of all digits in "+num+" is "+sum);
    }

}
