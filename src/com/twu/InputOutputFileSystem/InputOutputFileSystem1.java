package com.twu.InputOutputFileSystem;

import java.io.File;

public class InputOutputFileSystem1 {
    public static void main(String[] args) {
        getAllFileName();
    }

    public static void getAllFileName() {
        File file = new File("E:\\TWHomeWork");
        String[] fileList = file.list();

        System.out.println("A ll file/directory names from the given");
        for (String name:fileList) {
            System.out.println(name);
        }
    }

}
