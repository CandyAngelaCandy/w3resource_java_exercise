package com.twu.DateTime;

public class DateTime37 {
    public static void main(String[] args) {
        calSeconds();
    }

    public static void calSeconds() {
       long seconds = System.currentTimeMillis() /1000l;
        System.out.println("The seconds since 1970: "+seconds);
    }
}
