package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class spu_101_DateTimeFormatter {
    public static void main(String[] args) {
        LocalDateTime ld = LocalDateTime.now();// this is for date
        System.out.println(ld);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-mm-yy"); // this  is the format
        String myDate = ld.format(df);// Creating date string using date and format
        System.out.println(myDate);
    }
}
