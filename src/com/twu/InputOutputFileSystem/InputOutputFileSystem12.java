package com.twu.InputOutputFileSystem;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class InputOutputFileSystem12 {
    public static void main(String[] args) {
        readPlainTextFileByLine();
    }

    public static void readPlainTextFileByLine() {
        try {
            FileReader fr = new FileReader("E:\\TWHomeWork\\1.txt");
            BufferedReader br = new BufferedReader(fr);
            String conLine;

            while ((conLine = br.readLine()) != null) {
                System.out.println(conLine);
            }
            br.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
