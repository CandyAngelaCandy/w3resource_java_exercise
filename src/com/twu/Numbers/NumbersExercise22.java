package com.twu.Numbers;

import java.util.Scanner;

public class NumbersExercise22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a number: ");

        long num = sc.nextLong();

        if (isMersenneNum(num)) {
            System.out.println(num + " is a Mersenne number.");
        } else {
            System.out.println(num + " is not a Mersenne number.");
        }

    }

    public static boolean isMersenneNum(long num) {
        int pow = (int) Math.round(Math.log(num + 1) / Math.log(2.0));

        if (pow > 1 && Math.pow(2, pow) - 1 == num) return true;
        return false;
    }
}
