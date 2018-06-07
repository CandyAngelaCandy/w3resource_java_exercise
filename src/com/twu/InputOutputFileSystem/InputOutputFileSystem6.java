package com.twu.InputOutputFileSystem;

import java.io.File;

public class InputOutputFileSystem6 {
    public static void main(String[] args) {
        compareTwoFile();
    }

    public static void compareTwoFile() {
        File file1 = new File("E:\\TWHomeWork\\1.txt");
        File file2 = new File("E:\\TWHomeWork\\2.txt");

        int comp = file1.compareTo(file2);
        System.out.println("file1 and file2 comparison: "+comp);
    }
}
