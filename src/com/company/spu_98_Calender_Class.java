package com.company;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class spu_98_Calender_Class { // it is a Abstract class
    public static void main(String[] args) {
//        Calendar c = Calendar.getInstance();
//        System.out.println(c.getCalendarType());
//        System.out.println(c.getTimeZone());

        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone().getID());

    }
}
