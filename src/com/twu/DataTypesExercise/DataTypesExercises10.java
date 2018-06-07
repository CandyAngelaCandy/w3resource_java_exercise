package com.twu.DataTypesExercise;

import java.util.Scanner;

public class DataTypesExercises10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input six non-negative digits: ");

        int val = in.nextInt();

        divideIndividualDigits(val);
    }
    public static void divideIndividualDigits(int val){
        String[] str = Integer.toString(val).split("");
        String result = "";
        for (int i = 0; i < str.length; i++) {
            result+=str[i]+" ";
        }
        System.out.println(result);

    }
}
