package com.twu.Numbers;

import static java.util.stream.LongStream.rangeClosed;

public class NumbersExercise2 {
    public static void main(String[] args) {
        judgeAbuDefPerNum();
    }

    public static void judgeAbuDefPerNum() {
        System.out.println("Number Counting [(integers) between 1 to 10,000]: ");

        int DefNum = 0,PerNum = 0,AbuNum = 0;

        for (int i = 1; i <= 10000; i++) {
            if (calSumOfDivisor(i)  > i) {
                AbuNum++;
            }

            if (calSumOfDivisor(i)  == i) {
                PerNum++;
            }

            if (calSumOfDivisor(i)  < i) {
                DefNum++;
            }
        }

        System.out.println("Deficient number: "+DefNum);
        System.out.println("Perfect number:  "+PerNum);
        System.out.println("Abundant number: "+AbuNum);
    }

    public static int calSumOfDivisor(int num) {
        int sumOfDivisor = 0;
        for (int i = 1; i < num ; i++) {
            if (num % i == 0 ) {
                sumOfDivisor+=i;
            }
        }
        return sumOfDivisor;
    }
}
