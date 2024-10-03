package com.neoteric.java.date;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeZone
{
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current Date: " + currentDate);

        LocalDate fromDate = LocalDate.of(2024, 10, 4);
        System.out.println("From Date: " + fromDate);

        ZonedDateTime currentDateTimeWithZone = ZonedDateTime.now();
        System.out.println("Current Date and Time with Time Zone: " + currentDateTimeWithZone);

        //  time zone of the place (location)
        ZoneId zoneId = ZoneId.of("Asia/Kolkata");
        ZonedDateTime zonedDateTime = ZonedDateTime.now(zoneId);
        System.out.println("Current Date and Time in Asia/Kolkata: " + zonedDateTime);

        // Format the date and time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss z");
        String formattedDateTime = zonedDateTime.format(formatter);
        System.out.println("Formatted Date and Time in Asia/Kolkata: " + formattedDateTime);
        ///set to date
       LocalDate toDate = LocalDate.of(2025, 10, 1);
        System.out.println("To Date: " + toDate);

    }
}
