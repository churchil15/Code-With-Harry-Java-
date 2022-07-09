package com.company;

import java.util.Scanner;
public class CBSE_Board_Percent {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float TMO, TM, Percent;

        System.out.println("************This is CBSE Board Percentage calculator************");
        System.out.print("Enter total marks of a subject (Example 100 or 80): ");
        float a = sc.nextInt();
        TM = a*5;

        System.out.print("Enter marks of Physics: ");
        float m1 = sc.nextFloat();

        System.out.print("Enter marks of Chemistry: ");
        float m2 = sc.nextFloat();

        System.out.print("Enter marks of Maths: ");
        float m3 = sc.nextFloat();

        System.out.print("Enter marks of English: ");
        float m4 = sc.nextFloat();

        System.out.print("Enter marks of Optional Subject: ");
        float m5 = sc.nextFloat();


        TMO = m1 + m2 + m3 + m4 + m5;
        System.out.println("Total marks obtained by student is: " + TMO + "/" + TM);

        Percent = (TMO/TM)*100;
        System.out.print("Percentage Obtained by the following Student is: " + Percent + "%");
    }
}
