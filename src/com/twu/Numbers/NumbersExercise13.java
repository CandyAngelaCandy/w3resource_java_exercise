package com.twu.Numbers;

import java.util.Scanner;

public class NumbersExercise13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a number: ");

        long num = sc.nextLong();

        System.out.println(isPronic(num) ? "a Pronic Number" : "Not a Pronic Number");
    }

    public static boolean isPronic(long num) {
        for (int i = 1; i < num; i++) {
            if(i*(i+1)==num) return true;
        }
        return false;
    }
}
