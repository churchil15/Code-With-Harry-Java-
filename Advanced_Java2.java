package com.company;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * This class is to demonstrate what javadoc is and how it is used in the java industry
 * This is <i>italic</i> word<p>This is new Paragraph</p>
 * @author Churchil Yash Rajpal
 * @version  0.15
 * @since 2001
 * @see <a href="https://docs.oracle.com/en/java/javase/14/docs/api/index.html" target = "_blank">Java Docs</a>
*/

@FunctionalInterface
interface myFunctionalInterface{
    void meth();
}

class NewPhone extends Phone{
    @Override
    public void on(){
        System.out.println("Turning on New Phone!!");
    }

    @Deprecated
    public int sum(int a, int b){
        return a+b;
    }
}

@FunctionalInterface
interface DemoAnnoy{
    void meth1(int a);
//    void meth2();
}

//class Churchil implements DemoAnnoy{
//    @Override
//    public void meth1(){
//        System.out.println("This is method 1");
//    }
//}

//class AnonyDemo implements DemoAnnoy{
//    public void display(){
//        System.out.println("Hello");
//    }
//
//    @Override
//    public void meth1(){
//        System.out.println("This is method 1");
//    }
//
//    @Override
//    public void meth2(){
//        System.out.println("This is method 2");
//    }
//}


//Generic Class
class MyGeneric<T1, T2>{
    int val;
    private T1 t1;
    private T2 t2;

    MyGeneric(int a, T1 b, T2 c){
        val = a;
        t1 = b;
        t2 = c;
    }

    public void setVal(int a){
        val = a;
    }

    public int getVal(){
        return val;
    }

    public void setT1(T1 a){
        t1 = a;
    }

    public T1 getT1(){
        return t1;
    }

    public void setT2(T2 a){
        t2 = a;
    }

    public T2 getT2(){
        return t2;
    }

}

public class Advanced_Java2 {
    /**
     * This is a method which is used to add two integer numbers
     * @param a  This is an integer argument supplied to the method add
     * @param b  This is an integer argument supplied to the method add
     * @throws   ArithmeticException if a value is 0
     * @return   This method return sum of 'a' and 'b'
     * @deprecated This method is deprecated, please use '+' operator for addition
     */

    public static int add(int a, int b) throws ArithmeticException{
        if (a==0){
            throw new ArithmeticException();
        }
        return a+b;
    }

    /**
     * Hello this is the main method of Advanced_Java2 Class
     * @param args  These are the arguments supplied to our main method
     */
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
//        System.out.println("This is my main method!!");

        NewPhone p = new NewPhone();
//        p.on();
        p.sum(5, 6);

//        DemoAnnoy a = new AnonyDemo();  // aap interface ka reference de kr sirf usi class ka object create krskte ho jo ki iss interface ko implement krrhi hogi
//        a.meth1();


//        Anonymous Class Starts Here -->
//        DemoAnnoy a = new DemoAnnoy() {    // Hmne reference diya hai interface ka hi, lekin object jo bnaya hai vo ek Anonymous class ka hai
//            @Override
//            public void meth1() {
//                System.out.println("This is method 1");
//            }
//
//            @Override
//            public void meth2() {
//                System.out.println("This is method 2");
//            }
//        };
//
//        a.meth1();


//        Lambda Expressions -->
//        aap lambda expressions ka use krke ek aisa object create krskte ho ek aise interface ka jisme sirf ek method hai
//        DemoAnnoy d = new Churchil();
//        d.meth1();

        DemoAnnoy d2 = (a)->{
            System.out.println("This is method 1 " + a);
        };
        d2.meth1(5);


//      Generics -->
//        ArrayList arrayList = new ArrayList();
//        arrayList.add("str");
//        arrayList.add(65);
//        arrayList.add(789);
//
//        int a = (int) arrayList.get(0);
//        System.out.println(a);


        ArrayList<Integer> a = new ArrayList<>();   // aapne supply krdiya hai uss class ka naam(Integer) jiska object aap use krna chahte ho iss ArrayList class me
        a.add(12);                                  // to aapko baar-baar type cast krne ki zarorrat nhi padegi ArrayList ke elements ko access krte waqt
        a.add(24);
        a.add(36);
        a.add(48);
//        a.add("churchil");  --> This shows error because ArrayList is expecting an Integer object

//        System.out.println(a.get(2));

//        MyGeneric<String> mg = new MyGeneric<>(12, "Churchill");
//        System.out.println(mg.getT1());
//      Iska sense bas yahi hai ki apart from using any pre-defined class jo ki Generic leti/use hai, hmne apni khud ki ek class bnali
//      jo ki ek Generic type ka object argument T1 le rhi hai jisko hmne <String> set krdiya hai

//        Generics is basically we are passing classes to already defined classes.

//      We can set more than one Generics for our class -->
//        MyGeneric<String, Float> mg2 = new MyGeneric<>(12, "Churchill", 12.365f);
//
//        String str = mg2.getT1();
//        System.out.println(str);
//
//        Float flt = mg2.getT2();
//        System.out.println(flt);


//        File Handling -->
//        To Create a new File -->
        File myFile = new File("fileHandling.txt");   // Yha pr hmne File Class ka object create kiya hai
        try{
            myFile.createNewFile();  // createNewFile() method of File class is used to create a file.
        }
        catch (IOException e){
            System.out.println("Unable to create file");
            System.out.println(e);
        }


//        To Write to a File -->
        try {
            FileWriter w = new FileWriter("fileHandling.txt");       // Yha pr hmne FileWriter Class ka object create kiya hai
            w.write("This is our first file created using file handling in java\n");     // write() method ka use krke File me content write krte ho
            w.write("and we have wrote this content using write method of java.io.FileWriter class.\n");
            w.close();           // Its a good practice to always close the file after using it
        } catch (IOException e) {
            System.out.println("Unable to write the file");
            System.out.println(e);
        }


//        Reading the File -->
        File f = new File("fileHandling.txt");    // Yha pr hm dubara se File class ka object create krenge
        try{
            Scanner sc = new Scanner(f);     // File Class ke object ko Scanner Class me pass krna hai
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }
        catch (FileNotFoundException e){
            System.out.println("Unable to locate the file");
            System.out.println(e);
        }

//        Deleting a File-->
//        File f = new File("fileHandling.txt");
//        f.delete();   // delete() method is used to delete the file

    }
}

/*
        Scanner sc = new Scanner(System.in);
        sc.next();       // ye use krte hai ek character ya ek word lene ke liye (one word string)
        sc.nextLine();   // ye use krte hai ek puri line lene ke liye (multi word string)
        sc.hasNext();        // hasNext() method isliye use kiya jaata hai ye dekhne ke liye ki kuch entered kiya hai ki nhi
        sc.hasNextLine();    // hasNextLine() method bhi use krte hai ye dekhne ke liye ki kuch enter kiya gya hai ki nhi
        sc.close();

        sc.hasNextInt();  // hasNextInt() method isliye use krte hai ye dekhne ke liye ki jo enter kiya hai vo integer hai ki nhi

        sc.hasNext();
        sc.hasNextLine();
 */