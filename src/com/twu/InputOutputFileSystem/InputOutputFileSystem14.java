package com.twu.InputOutputFileSystem;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InputOutputFileSystem14 {
    public static void main(String[] args) {
        readFileAndStoreInArr();
    }

    public static void readFileAndStoreInArr() {
        List<String> dataList = new ArrayList<>();

        try {
            FileReader fr = new FileReader("E:\\TWHomeWork\\1.txt");
            BufferedReader br = new BufferedReader(fr);
            String conLine;

            while ((conLine = br.readLine()) != null) {
                dataList.add(conLine);
            }
            br.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(Arrays.toString(dataList.toArray()));
    }
}
