package com.twu.Numbers;

public class NumbersExercise25 {

    public static void main(String[] args) {
        printAllPellSeq();
    }

    public static void printAllPellSeq() {
        int[] num = new int[21];
        num[0] = 0;
        num[1] = 1;

        System.out.println("First 20 Pell numbers: ");
        System.out.print(num[1]+" ");

        for (int i = 2; i < 21; i++) {
            num[i] = 2 * num[i - 1] + num[i - 2];
            System.out.print(num[i] + " ");
        }
    }
}
