package com.twu.DateTime;

import java.util.Calendar;

public class DataTime1 {

    public static void main(String [] args){
        createDateObject();
    }

    public static void createDateObject(){
        Calendar cal = Calendar.getInstance();//得到当前时间

        // displays the current date and time
        System.out.println("Current Calendar Date: " + cal.getTime());

        // use clear method to set all field values and time value as undefined.
        cal.clear();

        // print the result
        System.out.println("The calendar shows : " + cal.getTime());

        //set date and time
        cal.set(Calendar.YEAR,2018);
        cal.set(Calendar.MONTH,6);
        cal.set(Calendar.DATE,4);

        System.out.println("The updated calendar shows : " + cal.getTime());
    }
}
