package com.twu.InputOutputFileSystem;

import java.io.*;

public class InputOutputFileSystem10 {
    public static void main(String[] args) {
        System.out.println(convertFileToByteArr());
    }

    public static byte[] convertFileToByteArr() {
        byte[] buffer = null;

        try {
            File file = new File("E:\\TWHomeWork\\1.txt");
            FileInputStream fis = new FileInputStream(file);

            ByteArrayOutputStream bais = new ByteArrayOutputStream(1000);
            byte[] b = new byte[1000];

            int len;

            //read方法是先规定一个数组长度，将这个流中的字节缓冲到数组b中，返回的这个数组中的字节个数，
            //这个缓冲区没有满的话，则返回真实的字节个数，到未尾时都返回-1
            while ((len = fis.read(b)) != -1) {
                System.out.println(new String(b, 0, len-1));
                bais.write(b,0,len);
            }

            fis.close();
            bais.close();
            buffer = bais.toByteArray();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return buffer;
    }
}
