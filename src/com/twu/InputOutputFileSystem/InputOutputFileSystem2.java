package com.twu.InputOutputFileSystem;

import java.io.File;
import java.io.FilenameFilter;

public class InputOutputFileSystem2 {
    public static void main(String[] args) {
        listSpecExtensionFile();
    }

    public static void listSpecExtensionFile() {
        File file = new File("E:\\TWHomeWork");

        FilenameFilter filenameFilter = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if(name.toLowerCase().endsWith(".txt")) return true;
                return false;
            }
        };

        String[] fileList = file.list(filenameFilter);

        for (String fileName:fileList) {
            System.out.println(fileName);
        }
    }
}
