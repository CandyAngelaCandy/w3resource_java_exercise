package com.twu.InputOutputFileSystem;

import java.io.File;
import java.util.Date;

public class InputOutputFileSystem7 {
    public static void main(String[] args) {
        getLastModifiedTime();
    }

    public static void getLastModifiedTime() {
        File file = new File("E:\\TWHomeWork\\1.txt");
        Date date = new Date(file.lastModified());
        System.out.println("The last modified time of file "+file.getAbsolutePath()+": "+
        date);
    }

}
