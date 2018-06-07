package com.twu.Numbers;

import java.util.Scanner;

public class NumbersExercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input an integer number: ");

        int num = sc.nextInt();

        if (num <= 0) {
            System.out.print("Input a correct number.");
        }

        judgeUglyNum(num);
    }

    public static void judgeUglyNum(int num) {
        while (num % 2 == 0) {
            num /= 2;
        }

        while (num % 3 == 0) {
            num /= 2;
        }

        while (num % 5 == 0) {
            num /= 2;
        }

        if (num == 1) {
            System.out.println("It is an ugly number.");
        } else {
            System.out.println("It is not an ugly number.");
        }
    }

}
