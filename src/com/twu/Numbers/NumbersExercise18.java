package com.twu.Numbers;

import java.util.Scanner;

public class NumbersExercise18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input Data: ");
        System.out.print("Input a number: ");

        long num = sc.nextLong();

        if (isCube(num)) {
            System.out.println("It is a cube.");
        } else {
            System.out.println("It is not a cube.");
        }
    }
    public static boolean isCube(long num) {

        int base = (int)Math.round(Math.pow(num,1.0/3.0));

        if (Math.pow(base, 3) == num) return true;
        return false;
    }
}
