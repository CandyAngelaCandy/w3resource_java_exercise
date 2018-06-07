package com.twu.InputOutputFileSystem;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class InputOutputFileSystem17 {
    public static void main(String[] args) {
        readFirstThreeLine();
    }

    public static void readFirstThreeLine() {
        try {
            String fileName = "E:\\TWHomeWork\\1.txt";
            String conLine = "";

            LineNumberReader lmReader = new LineNumberReader(new FileReader(fileName));
            while ((conLine = lmReader.readLine())!=null && lmReader.getLineNumber() <=3) {
                System.out.println(conLine);
            }
            lmReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
