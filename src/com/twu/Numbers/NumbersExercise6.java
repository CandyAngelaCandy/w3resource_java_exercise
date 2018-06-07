package com.twu.Numbers;

public class NumbersExercise6 {
    public static void main(String[] args) {
        printNarcissisticDecimalNum();
    }

    public static void printNarcissisticDecimalNum() {
        for (long i = 0, num = 0; i < 15; num++) {
            if (isNarcissisticNum(num)) {
                i++;
                System.out.print(num + " ");
            }
        }
    }

    public static boolean isNarcissisticNum(long num) {
        if (num < 0) return false;

        String numStr = String.valueOf(num);

        int sum = 0;

        int len = numStr.length();

        for (int i = 1; i <= len; i++) {
            char digit = numStr.charAt(i - 1);
            sum += Math.pow(Character.digit(digit,10), len);
        }

        if (sum == num) return true;

        return false;
    }
}
