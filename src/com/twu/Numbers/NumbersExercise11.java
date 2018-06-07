package com.twu.Numbers;

import java.util.Scanner;

public class NumbersExercise11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a number: ");

        long num = sc.nextLong();

        System.out.println(isDisarium(num) ? "a Disarium Number" : "Not a Disarium Number");

    }

    public static boolean isDisarium(long num) {
        String numStr = Long.toString(num);

        int len = 1;

        int sum = 0;
        for (char c : numStr.toCharArray()) {
            sum += Math.pow(Character.digit(c,10), len);
            len++;
        }
        return sum == num;
    }
}
