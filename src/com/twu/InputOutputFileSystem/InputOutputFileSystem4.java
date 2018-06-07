package com.twu.InputOutputFileSystem;

import java.io.File;

public class InputOutputFileSystem4 {
    public static void main(String[] args) {
        isFileReadOrWrite();
    }

    public static void isFileReadOrWrite() {
        File file = new File("E:\\TWHomeWork\\1.txt");

        if (file.canRead()) {
            System.out.println(file.getAbsolutePath()+" can read.");
        } else {
            System.out.println(file.getAbsolutePath()+" can not read.");
        }

        if (file.canWrite()) {
            System.out.println(file.getAbsolutePath()+" can write.");
        } else {
            System.out.println(file.getAbsolutePath()+" can not write.");
        }
    }
}
