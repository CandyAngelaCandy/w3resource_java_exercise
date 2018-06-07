package com.twu.DateTime;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class DateTime21 {
    public static void main(String[] args) {
        getCurrentTimeInAllTimeZones();
    }

    public static void getCurrentTimeInAllTimeZones() {
        ZoneId.SHORT_IDS.keySet()
                .stream()
                .forEach(
                zoneKey -> System.out.println( ZoneId.of(ZoneId.SHORT_IDS.get(zoneKey))+": "
                +LocalDateTime.now(ZoneId.of(ZoneId.SHORT_IDS.get( zoneKey )))));

    }
}
