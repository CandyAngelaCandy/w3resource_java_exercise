package com.twu.Numbers;

public class NumbersExercise4 {

    public static void main(String[] args) {
        printAllKaprekarNum();
    }

    public static void printAllKaprekarNum() {
        int count = 0;

        for (int i = 1; i < 1000; i++) {
            if (judgeKaprekarNum(i)) count++;
        }
        System.out.println(count + " Kaprekar numbers.");
    }

    public static boolean judgeKaprekarNum(int num) {
        long squareNum = num * num;
        String sNumStr = String.valueOf(squareNum);

        //i是一位数
        if (sNumStr.length() == 1 && squareNum == num) {
            System.out.println(num + "    " + sNumStr + "    " + "0 + " + squareNum);
            return true;
        }

        for (int j = 1; j < sNumStr.length(); j++) {

            String leftNumStr = sNumStr.substring(0, j);
            String rightNumStr = sNumStr.substring(j);

            long leftNum = Long.parseLong(leftNumStr);
            long rightNum = Long.parseLong(rightNumStr);

            if (rightNum > 0 && leftNum + rightNum == num) {
                System.out.println(num + "    " + sNumStr + "    " + leftNumStr + " + " + rightNumStr);
                return true;
            }
        }

        return false;

    }


}
