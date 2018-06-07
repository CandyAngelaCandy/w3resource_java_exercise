package com.twu.Numbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumbersExercise27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a number: ");

        long num = sc.nextLong();

        if (isCircularPrime(num)) {
            System.out.println("\n"+"      " + num + " is a Circular Prime number.");
        } else {
            System.out.println("      " + num + " is not a Circular Prime number.");
        }
    }

    public static boolean isCircularPrime(long num) {
        int lastDigit = (int) num % 10;

        if (lastDigit == 0 || lastDigit == 5 || lastDigit % 2 == 0) {
            return false;
        }

        List<Long> circularList = new ArrayList<>();

        long tempNum = moveBit(num);
        circularList.add(num);
        circularList.add(tempNum);

        if (isPrime(num)) {
            while (tempNum != num) {
                if (isPrime(tempNum)) {
                    circularList.add(tempNum);
                    tempNum = moveBit(tempNum);
                } else {
                    return false;
                }
            }
        }

        System.out.println("Output:");
        for (long seq : circularList) {
            System.out.println("      " + seq);
        }
        return true;

    }

    public static boolean isPrime(long num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static long moveBit(long num) {
        String numStr = Long.toString(num);
        String newStr = numStr.substring(1) +
                numStr.substring(0, 1);
        return Long.valueOf(newStr);
    }


}
