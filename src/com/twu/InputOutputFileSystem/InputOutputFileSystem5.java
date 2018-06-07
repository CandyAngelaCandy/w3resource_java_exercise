package com.twu.InputOutputFileSystem;

import java.io.File;

public class InputOutputFileSystem5 {
    public static void main(String[] args) {
        isFileOrDirectory();
    }

    public static void isFileOrDirectory() {
        File file = new File("E:\\TWHomeWork\\1.txt");

        if (file.isDirectory()) {
            System.out.println(file.getAbsolutePath()+" is a directory.");
        }else {
            System.out.println(file.getAbsolutePath()+" is not a directory.");
        }

        if (file.isFile()) {
            System.out.println(file.getAbsolutePath() + " is a file.");
        } else {
            System.out.println(file.getAbsolutePath() + " is not a file.");
        }
    }
}
