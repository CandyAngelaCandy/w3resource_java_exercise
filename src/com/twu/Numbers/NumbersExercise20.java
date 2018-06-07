package com.twu.Numbers;

public class NumbersExercise20 {
    public static void main(String[] args) {
        printFirstTenFermatNum();
    }

    public static void printFirstTenFermatNum() {
        for (int i = 0; i <10 ; i++) {
            System.out.println(Math.pow(2,Math.pow(2,i))+1);
        }
        System.out.println("Infinity");
    }
}
