package com.twu.InputOutputFileSystem;

import java.io.File;

public class InputOutputFileSystem3 {
    public static void main(String[] args) {
        isFileExist();
    }

    public static void isFileExist() {
        File file = new File("E:\\TWHomeWork\\1.txt");

        if (file.exists()) {
            System.out.println("The directory or file exists.");
        } else {
            System.out.println("The directory or file does not exist.");
        }
    }

}
