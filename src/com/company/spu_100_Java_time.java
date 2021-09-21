package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class spu_100_Java_time {
    public static void main(String[] args) {

        LocalDate l = LocalDate.now();
        System.out.println(l);

        LocalTime t = LocalTime.now();
        System.out.println(t);

        LocalDateTime ld = LocalDateTime.now();
        System.out.println(ld);

    }
}
