package com.twu.Numbers;

import java.util.Scanner;

public class NumbersExercise15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a number: ");

        String numStr = sc.nextLine();

        System.out.println(isDuckNum(numStr) ? "a Duck  Number" : "Not a Duck  Number");
    }

    public static boolean isDuckNum( String numStr) {

        if (numStr.indexOf("0") != -1 && numStr.indexOf("0") != 0) {
            return true;
        }
        return false;
    }
}
