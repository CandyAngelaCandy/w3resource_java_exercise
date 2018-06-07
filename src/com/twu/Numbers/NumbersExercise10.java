package com.twu.Numbers;

import java.util.HashSet;
import java.util.Scanner;

public class NumbersExercise10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a nu1mber: ");

        long num = sc.nextLong();

        if (isHappyNum(num)) {
            System.out.println("Happy Number");
        } else {
            System.out.println("Unhappy Number");
        }
    }

    public static boolean isHappyNum(long num) {
        HashSet<Long> numSeq = new HashSet<>();

        while (num != 1 && numSeq.add(num)) {
            int sum = 0;
            while(num !=0){
                sum += Math.pow(num % 10, 2);
                num /=10;
            }
            num = sum;
        }
        return num == 1;
    }
}
