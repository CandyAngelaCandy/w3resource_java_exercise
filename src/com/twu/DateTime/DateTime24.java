package com.twu.DateTime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime24 {
    public static void main(String[] args) {
        getRemainingMonths();
    }

    public static void getRemainingMonths() {
        LocalDate currentDate = LocalDate.now();

        System.out.println("Default format of LocalDate="+currentDate);

        System.out.println(currentDate.format(DateTimeFormatter.ofPattern("d::MMM::yyyy")));

        LocalDateTime currentDateTime = LocalDateTime.now();

        System.out.println("Default format of LocalDateTime="+currentDateTime);

        System.out.println(currentDateTime.format(DateTimeFormatter.ofPattern
                ("d::MMM:yyyy HH::mm:ss")));

        Instant timestamp = Instant.now();

        System.out.println("Default format of Instant="+timestamp);

        LocalDateTime dt = LocalDateTime.parse("27::04::2014 21::39::48",
                DateTimeFormatter.ofPattern("dd::MM::uuuu HH::mm::ss"));
        System.out.println("Default format after parsing: "+dt);

    }
}
