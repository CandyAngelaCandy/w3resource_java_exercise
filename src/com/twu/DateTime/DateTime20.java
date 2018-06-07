package com.twu.DateTime;

import java.time.Instant;

public class DateTime20 {
    public static void main(String[] args) {
        getCurrentTimestamp();
    }

    public static void getCurrentTimestamp() {
        Instant currentTimestamp = Instant.now();
        System.out.println("current timestamp: "+currentTimestamp);
    }
}
