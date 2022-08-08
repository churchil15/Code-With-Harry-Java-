package com.company;

import java.util.Date;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.GregorianCalendar;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;

public class Date_Time {
    public static void main(String[] args) {
//        System.out.println("Welcome to Date and Time in Java!!");
        System.out.println(System.currentTimeMillis()/1000/60/60/24/365);

        System.out.println("Milliseconds since 1 Jan 1970: " + System.currentTimeMillis());
        System.out.println("Seconds since 1 Jan 1970: " + System.currentTimeMillis()/1000);
        System.out.println("Minutes since 1 Jan 1970: " + System.currentTimeMillis()/1000/60);
        System.out.println("Hours since 1 Jan 1970: " + System.currentTimeMillis()/1000/60/60);
        System.out.println("Days since 1 Jan 1970: " + System.currentTimeMillis()/1000/60/60/24);
        System.out.println("\n");

        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());

//        This methods are deprecated
        System.out.println(d.getDate());
        System.out.println(d.getYear());
        System.out.println(d.getMonth());
        System.out.println("\n");


//        Since calendar class is an abstract class we cannot create its object
//        Calendar c = Calendar.getInstance();  // This is the way to create an instance/object of Calendar class
//        System.out.println(c.getCalendarType());
//        System.out.println(c.getTimeZone());

//        Calendar c2 = Calendar.getInstance();
//        System.out.println(c2.getTimeZone());
//        System.out.println(c2.getTimeZone().getID());

//        Calendar c3 = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
//        System.out.println(c3.getTimeZone());
//        System.out.println(c3.getTimeZone().getID());
        System.out.println("\n");

//        System.out.println(c2.get(Calendar.SECOND));
//        System.out.println(c2.get(Calendar.MINUTE));
//        System.out.println(c2.get(Calendar.HOUR));
//        System.out.println(c2.get(Calendar.DATE));
//        System.out.println(c2.get(Calendar.YEAR));
//        System.out.println(c2.get(Calendar.HOUR_OF_DAY) + ":" + c2.get(Calendar.MINUTE) + ":" + c2.get(Calendar.SECOND));

//        System.out.println(c2.getTime());
        System.out.println("\n");


//       Gregorian Calendar Class -->
        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc.isLeapYear(2020));

        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);
        System.out.println(TimeZone.getAvailableIDs()[3]);
        System.out.println("\n");

//        for (int i = 0;i<TimeZone.getAvailableIDs().length;i++){
//            System.out.println(TimeZone.getAvailableIDs()[i]);
//        }


        LocalDate l = LocalDate.now();
        System.out.println(l);
//
//        LocalTime t = LocalTime.now();
//        System.out.println(t);

        LocalDateTime ldt = LocalDateTime.now();   // This is date
        System.out.println(ldt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy --> E H:mm a");   // This is format
        String myDate = ldt.format(df);
        System.out.println(myDate);
        System.out.println("\n");


//        Practise Set -->
        System.out.println("Question 1: ");
        ArrayList<String> name = new ArrayList<>();
        name.add("Churchil");
        name.add("Kshitij");
        name.add("Raghav");
        name.add("Pradumn");
        name.add("Vidit");
        name.add("Kamal");
        name.add("Lohan");
        name.add("Deepak");
        name.add("Anand");
        name.add("Akshat");

        for (int i = 0;i<name.size();i++){
            System.out.println(name.get(i));
        }
        System.out.println("\n");


        System.out.println("Question 2: ");
        Date date = new Date();
//        System.out.println(date);
        System.out.println(date.getHours() + ":" + date.getMinutes() + ":" + date.getSeconds());
        System.out.println("\n");


        System.out.println("Question 3: ");
        Calendar cl = Calendar.getInstance();
//        System.out.println(cl.getTime());
        System.out.println(cl.get(Calendar.HOUR_OF_DAY) + ":" + cl.get(Calendar.MINUTE) + ":" + cl.get(Calendar.SECOND));
        System.out.println("\n");


        System.out.println("Question 4: ");
        LocalTime time = LocalTime.now();  // time reference ke andar current time store ho chuka hai upto nanoseconds.
//        System.out.println(time);

        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("H:mm:s");
        String t = time.format(timeFormatter);
        System.out.println(t);

        System.out.println("\n");

        System.out.println("Question 5: ");
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(1);
        set.add(5);
        set.add(3);
        set.add(4);

        System.out.println(set);


    }
}
