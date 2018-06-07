package com.twu.Numbers;

import java.util.HashSet;

public class NumbersExercise9 {
    public static void main(String[] args) {
        printHappyNum();
    }

    public static void printHappyNum() {
        System.out.println("First 10 Happy numbers:");
        for (int i = 0, n = 1; i < 10; n++) {
            if (isHappyNum(n)) {
                i++;
                System.out.print(n + " ");
            }
        }
    }

    public static boolean isHappyNum(int num) {
        HashSet<Integer> numSeq = new HashSet<>();

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
