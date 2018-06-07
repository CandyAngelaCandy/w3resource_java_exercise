package com.twu.InputOutputFileSystem;

import java.io.File;

public class InputOutputFileSystem9 {
    public static void main(String[] args) {
        getFileSize();
    }

    public static void getFileSize() {
        File file = new File("E:\\TWHomeWork\\1.txt");

        long fileSizeInBytes = file.length();
        double fileSizeInKb = fileSizeInBytes / 1024;
        double fileSizeInMb = fileSizeInBytes / (1024 * 1024);

        System.out.println("The file size in bytes: " + fileSizeInBytes);
        System.out.println("The file size in kb: " + fileSizeInKb);
        System.out.println("The file size in mb: " + fileSizeInMb);
    }
}
