package com.twu.InputOutputFileSystem;

import java.io.*;

public class InputOutputFileSystem16 {
    public static void main(String[] args) {
        appendTextToFile();
    }

    public static void appendTextToFile() {
        try {
            String fileName = "E:\\TWHomeWork\\1.txt";
            FileWriter fw = new FileWriter(fileName,true);
            fw.write("\nInput output file system exercise\n");
            fw.close();

            BufferedReader br = new BufferedReader(new FileReader(fileName));

            String conLine = "";

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
