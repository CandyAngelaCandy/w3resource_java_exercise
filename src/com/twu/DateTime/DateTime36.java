package com.twu.DateTime;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateTime36 {
    public static void main(String[] args) {
        convertUnixTimestampToDate();
    }

    public static void convertUnixTimestampToDate() {
        long unixTimeStamp = 1492369860;

        Date date = new Date(unixTimeStamp * 1000);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");

        sdf.setTimeZone(TimeZone.getTimeZone("GMT-4"));

        System.out.println("The date converted by unix timestamp is: "+sdf.format(date));
    }
}
