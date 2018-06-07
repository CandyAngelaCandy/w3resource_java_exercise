package com.twu.DateTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime35 {
    public static void main(String[] args) {

        extractDateAndTime();

    }

    public static void extractDateAndTime() {

        String timeStr = "2016-07-14 09:00:02";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = null;

        try {
             date =  sdf.parse(timeStr);
        } catch (ParseException pe) {
            System.out.println(pe.getMessage());
        }

        String newStr = new SimpleDateFormat("MM/dd/yyyy, HH:mm:ss").format(date);
        System.out.println("\n"+newStr+"\n");

    }
}
