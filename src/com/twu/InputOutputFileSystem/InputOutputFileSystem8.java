package com.twu.InputOutputFileSystem;

import java.util.Scanner;

public class InputOutputFileSystem8 {
    public static void main(String[] args) {
        readInputFromConsole();
    }

    public static void readInputFromConsole() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please input: ");

        String input = sc.nextLine();

        System.out.println("Your input: ");

        System.out.println(input);
    }
}
