package com.twu.InputOutputFileSystem;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class InputOutputFileSystem13 {
    public static void main(String[] args) {
        readFileAndStore();
    }

    public static void readFileAndStore() {
        String data = "";
        try {
            FileReader fr = new FileReader("E:\\TWHomeWork\\1.txt");
            BufferedReader br = new BufferedReader(fr);
            String conLine;

            while ((conLine = br.readLine()) != null) {
                data += conLine +"\n";
            }
            br.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(data);
    }
}
