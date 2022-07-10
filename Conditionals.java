package com.company;

import java.util.Scanner;
public class Conditionals {
    public static void main(String[] args) {

//        System.out.println("Welcome to Conditionals in Java!!");
//        int age = 18;
//        if(age!=18)
//            System.out.println("You can Drive!!");
//        else
//            System.out.println("You are Underage, you cannot drive!!");

        boolean a = false;
        boolean b = true;
        if (a && b)
            System.out.println("Yes");
        else
            System.out.println("No");

        if (a || b)
            System.out.println("Yes");
        else
            System.out.println("No");

        System.out.println("Not a " + !a);
        System.out.println("Not b " + !b);

        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter your age: ");
//        int age = sc.nextInt();
        int age = 23;

        if (age>56)
            System.out.println("You are experienced");    // Agar pheli condition meet hogyi to aage ki conditions check nhi ki jayengi.
                                                          // Jo condition phele true ho jaati hai vo execute ho jayegi aur baaki ki conditons check krne ki zarorrat nhi padegi.
        else if (age>46)
            System.out.println("You are semi experienced");

        else if (age>36)
            System.out.println("You are semi-semi experienced");

        else
            System.out.println("You are not experienced");


//Switch Case ka default behaviour hota hai ki jaise hi koi case match hota hai vo uske baad ke saare case execute krdeta hai including default.

        switch (age){
            case 18:
                System.out.println("You are going to become an Adult!");
                break;
            case 23:
                System.out.println("You are going to get a Job!");
                break;
            case 60:
                System.out.println("You are going to get retired!");
                break;
            default:
                System.out.println("Enjoy your Life!!");
        }

        System.out.println("Out of Switch Case SCOPE!!");

//        int a1 = 10;
//        if (a1 = 11)   // if ke andar assignment nhi daal skte.
//            System.out.println("I am 11");
//        else
//            System.out.println("I am not 11");

//        System.out.println("Enter you Income: ");
//        long income = sc.nextLong();
//        double tax = 0.0;
//
//        if (income > 1000000){
//            tax = tax + 12500;                     // 1st Tax
//            tax = tax + 100000;                    // 2nd Tax
//            tax = tax + 0.3f * (income-1000000);
//            System.out.println("You need to Pay " + tax + " as Tax");
//        }
//        else if (income > 500000){
//            tax = tax + 12500;                      // 1st Tax
//            tax = tax + 0.2f * (income-500000);     // 2nd Tax
//            System.out.println("You need to Pay " + tax + " as Tax");
//        }
//
//        else if (income > 250000){
//            tax = 0.05f * (income-250000);
//            System.out.println("You need to Pay " + tax + " as Tax");
//        }
//
//        else
//            System.out.println("You don't need to pay any Tax!!");

//        System.out.println("Enter tha day of the week [1 for Monday, 2 for Tuesday....]");
//        int day = sc.nextInt();
//
//        switch (day){
//            case 1:
//                System.out.println("Monday!");
//                break;
//            case 2:
//                System.out.println("Tuesday!");
//                break;
//            case 3:
//                System.out.println("Wednesday!");
//                break;
//            case 4:
//                System.out.println("Thursday!");
//                break;
//            case 5:
//                System.out.println("Friday!");
//                break;
//            case 6:
//                System.out.println("Saturday!");
//                break;
//            case 7:
//                System.out.println("Sunday!");
//                break;
//            default:
//                System.out.println("Entered number is Wrong!!!!");
//        }

//        System.out.println("Enter the year");
//        int year = sc.nextInt();
//
//        if (((year % 400 == 0) || (year % 100 != 0)) && (year % 4 == 0))   // Condition for a Leap Year
//            System.out.println("Leap Year!!");
//        else
//            System.out.println("Not a Leap Year!!");


//        System.out.print("Enter Maximum marks of a subject: ");
//        float max = sc.nextFloat();
//        float TM = max*3;
//
//        System.out.print("Enter your marks in Sub1: ");
//        float m1 = sc.nextFloat();
//        System.out.print("Enter your marks in Sub2: ");
//        float m2 = sc.nextFloat();
//        System.out.print("Enter your marks in Sub3: ");
//        float m3 = sc.nextFloat();
//
//        float TMO, percent;
//        TMO = m1 + m2 + m3;
//
//        percent = (TMO/TM) * 100;
//        System.out.print("Percentage Obtained: " + percent + "%\n");
//
//        if ((percent >= 40.0f) && (m1 >= 0.33f * max && m2 >= 0.33f * max && m3 >= 0.33f * max))
//            System.out.println("Pass!!");
//        else
//            System.out.println("Fail!!");

        System.out.println("Enter the url of your website:");
        String str = sc.nextLine();

        boolean a1 = str.contains(".com");
        boolean b1 = str.contains(".org");
        boolean c1 = str.contains(".in");

        if (a1)
            System.out.println("Commercial Website");
        else if (b1)
            System.out.println("Organization Website");
        else if (c1)
            System.out.println("Indian Website");
        else
            System.out.println("Wrong URL");


    }
}

