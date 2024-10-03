package com.neoteric.java.date;
import java.time.LocalDate;

public class Time {
    public static void main(String[] args) {
        LocalDate currentdate= LocalDate.now();
        System.out.println("currentdate"+currentdate);
  LocalDate fromdate = LocalDate.of( 2024,2, 22);
        System.out.println(""+fromdate);
        LocalDate todate = LocalDate.of(2025,2,4);
        System.out.println(""+todate);



    }
}
