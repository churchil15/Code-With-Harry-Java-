package com.company;

import java.io.IOException;
import java.util.Scanner;      // Importing specific file in java.util package

//import java.util.*;            // Importing everything inside java.util package

import java.io.File;
import java.io.FileWriter;


//class C1{
//    public int a = 15;
//    protected int b = 20;
//    int c = 25;
//    private int d = 30;
//
//    public void meth1(){
//        System.out.println("This is method 1 taking input " + a);
//        System.out.println("This is method 1 taking input " + b);
//        System.out.println("This is method 1 taking input " + c);
//        System.out.println("This is method 1 taking input " + d);
//    }
//}

// Practice Set Classes and Interfaces from here -->
class C2{
    @Deprecated
    public void meth12(){
        System.out.println("This is method 12");
    }
}

interface I1{
    void meth31();
//    void meth41();
}

public class Packages_and_AccessModifiers {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        java.util.Scanner sc = new java.util.Scanner(System.in);     // Using Scanner object without importing Scanner file
//        int a = sc.nextInt();
//        System.out.println("This is my Scanner taking input " + a);

//        C1 c = new C1();
//        c.meth1();
//        System.out.println(c.a);
//        System.out.println(c.b);
//        System.out.println(c.c);
//        System.out.println(c.d); // Shows Error, Private access modifier attribute cannot be accessed in the same package directly using dot operator.


//        Advanced Java 2 Practise Set -->
//        Question 2
//        C2 c = new C2();
//        c.meth12();

//        Question 4
//        I1 i = new I1(){
//            @Override
//            public void meth31(){
//                System.out.println("This is method 31");
//            }
//
//            @Override
//            public void meth41(){
//                System.out.println("This is method 41");
//            }
//        };
//
//        i.meth31();
//        i.meth41();

//        I1 i2 = ()->{
//            System.out.println("This is method 31");
//        };
//        i2.meth31();


//        Question 5
//        Creation of a File -->
//        File myFile = new File("Multiplication.txt");
//        try{
//            myFile.createNewFile();
//        }
//        catch (IOException i){
//            System.out.println("Unable to create the file");
//        }

//      Yha pr hmko table print nhi krwani hai. Hmko table ki values ko line by line store krna hai ek String variable me jisko hm baad me use krske file ko write krne ke liye
        int a = 19;
        String table = "";
        for (int i = 1;i<=10;i++){
            table = table + (a + "*" + i + " = " + a*i);   // Ye '+' ka mtlb string concatenation hai, addition nhi
            table = table + "\n";
        }

        try{
            FileWriter w = new FileWriter("Multiplication.txt");
            w.write(table);
            w.close();
        }
        catch (IOException e){
            System.out.println("Unable to write the file");
        }



    }
}
