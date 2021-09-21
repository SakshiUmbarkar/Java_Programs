package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class spu_102_AdvanceJava1_PS {
    public static void main(String[] args) {
        // Problem 1
        ArrayList arr = new ArrayList();
        arr.add("Student 1");
        arr.add("Student 2");
        arr.add("Student 3");
        arr.add("Student 4");
        arr.add("Student 5");
        arr.add("Student 6");
        arr.add("Student 7");
        arr.add("Student 8");
        arr.add("Student 9");
        arr.add("Student 10");

        for (Object o : arr) {
            System.out.println(o);
        }
        // Problem 2

        Date d= new Date();
        System.out.println(d.getHours() + ":" + (d.getMinutes()) + ":" + (d.getSeconds()));

        // Problem 3
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" +c.get(Calendar.SECOND) );

        // Problem 4
        LocalDateTime ld = LocalDateTime.now();// this is for date
        System.out.println(ld);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("H:m:s"); // this  is the format
        String myDate = ld.format(df);// Creating date string using date and format
        System.out.println(myDate);

        // Problem 5
        HashSet<Integer>  s = new HashSet<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);
        s.add(6);
        s.add(7);
        System.out.println(s);

    }
}
