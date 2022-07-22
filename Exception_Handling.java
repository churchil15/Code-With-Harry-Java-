package com.company;

import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString(){
        return "I am toString()";
    }

    @Override
    public String getMessage(){
        return "I am getMessage()";
    }
}

class MaxAgeException extends Exception{
    @Override
    public String toString(){
        return "Age cannot be greater than 125";
    }
    @Override
    public String getMessage(){
        return "Make sure the entered age is correct";
    }
}

class NegativeRadiusException extends Exception{
    @Override
    public String getMessage(){
        return "Negative Radius is not allowed";
    }

    @Override
    public String toString(){
        return "Check your Radius again";
    }
}

class MaxRetriesException extends Exception{
    @Override
    public String toString(){
        return "You Exhausted your retries";
    }

    @Override
    public String getMessage(){
        return "Maximum no. of retires reached";
    }
}

public class Exception_Handling {

    public static int divide(int a, int b) throws ArithmeticException{   // Hmne ek warning dedi hai user ko ki ye custom method ek Exception throw krstka hai
        return a/b;                                                      // to apko usko try-catch block me daal ke handle krna hai.
    }

    public static double area(double radius) throws NegativeRadiusException{   // yha pr hm apni ek custom made exception ki warning de rhe hai user ko.
        if (radius<0){
            throw new NegativeRadiusException();       // agar value less then 0 (negative) hui, to ye Exception throw krhi dena.
        }                                              // Abb aage user dekhega ki usko kaise handle krna hai ise.
        return Math.PI * radius * radius;
    }

    public static int number(){
        try{
            int a = 50;
            int b = 0;
            int c = a/b;
            return c;       // ye return statement tb use hoga jab koi exception nhi aayega.
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("This is end of number method");
        }
        return -1;   // Agar me ye waala return nhi lgaunga to bhi mujhe error aayega that "missing return statement".
    }               // Aisa isliye kyuki apne ko uss case ko dekhna padega jb exception aa rha hai.


    public static void Q5() throws MaxRetriesException{
        int [] marks = {25, 74, 34, 58, 37};
        Scanner sc = new Scanner(System.in);

        int i;
        for (i = 0;i<5;i++){
            try{
                System.out.println("Enter Index no.");
                int index = sc.nextInt();
                System.out.println(marks[index]);
                break;
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
        if (i == 5){
            throw new MaxRetriesException();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//      Syntax Error -->
//        int a = 5;
//        int b = 9;
//        // c = 0;
//        System.out.println(a + b);

//      Logical Error -->
//      Create a Program for Prime No. b/w (1 - 10)
//        for (int i = 2;i<=10;i++){
//            if (i % 2 != 0){
//                System.out.println(i);
//            }
//        }

//      Run Time Error -->
//        int a = sc.nextInt();
//        System.out.println("Integer Part of 1000 divided by a is " + 1000/a);

//      Exception Handling -->
//        try{
//            int a = sc.nextInt();
//            System.out.println("Integer part of 1000 divided by " + a + " is " + 1000/a);
//        }
//        catch (Exception e){   // Idhar 'e' Exception Class ka ek object hai.
//            System.out.println("Division was not possible. Reason ---> " + e);
//        }
//
//        System.out.println("End of Try-Catch Block");


//      Handling Specific Exceptions -->
        int [] marks = new int[5];
        marks[0] = 75;
        marks[1] = 84;
        marks[2] = 62;
        marks[3] = 84;
        marks[4] = 60;

//        System.out.print("Enter the Array Index: ");
//        int index = sc.nextInt();
//        System.out.print("Enter the number with which you want to divide the value at index " + index + " with: ");
//
//
//        try{
//            int num = sc.nextInt();
//            System.out.println("\nElement at index " + index + " is " + marks[index]);
//            System.out.println("Value at index " + index + " divided by " + num + " is " + marks[index]/num);
//        }
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("Entered Index does not exist");
//        }
//        catch (ArithmeticException e){
//            System.out.println("Division was not Possible. Reason ---> " + e);
//        }
//        catch (Exception e){
//            System.out.println("Some other Exception Occurred");
//        }
//
//        System.out.println("End of Program");


//        Nested Try-Catch -->
//        System.out.print("Input a digit to enter into level 1 of try-catch block: ");
//
//        try{
//            int num = sc.nextInt();
//            System.out.println("Welcome to Nested Try-Catch");
//            try{
//                System.out.print("\nEnter Index of the Array: ");
//                int index = sc.nextInt();
//                System.out.println(marks[index]);
//            }
//            catch(ArrayIndexOutOfBoundsException e){
//                System.out.println("Index does not exist");
//                System.out.println("Exception at level 2");
//            }
//            catch(Exception e){
//                System.out.println(e);
//                System.out.println("Exception at level 2");
//            }
//        }
//        catch(Exception e){
//            System.out.println(e);
//            System.out.println("Exception at level 1");
//        }
//
//        System.out.println("End of Program");


//        Write a Program that allows you to keep accessing an array until a valid index is given by the user.

//        boolean flag = true;   // ye boolean apne ko set krna padega kyuki isko ek point pr aane ke baad false krna hai taaki while loop se bhaar nikal ske.
//        while(flag){
//            System.out.print("Enter the index: ");
//
//            try{
//                int index = sc.nextInt();
//                System.out.println(marks[index]);
//                break;
//            }
//            catch(ArrayIndexOutOfBoundsException e){
//                System.out.println("Entered Index does not exist!");
//                System.out.println("Try again\n");
//
//            }
//            catch (Exception e){         // agar koi out of bound exception ke alawa koi exception hua to tu iss catch block me ayega
//                System.out.println(e);
//                flag = false;      // flag ko false set krrhe hai taaki while loop ke bhaar aaske
//            }
//        }
//
//        System.out.println("Thanks for using this program");
//        Actually question me ye pucha hi nhi tha ki aapko saare types ke exceptions handle krne hai. Vo to bas hmne saare type ke exception ke liye program design krdiya.

//        Agar exception out of bound waala hua to hi program dubara chalega aur wapas input daalne ke liye bolega. Iske alawa koi exception hua to program
//        bas exception ko mention krke end ho jayega.


//        int a = sc.nextInt();
//        if (a<9){
//            try{
//                throw new MyException();                                               // Apni bnayi Exception ko throw krrhe hai. Hm khud hi apne exception ko throw krrhe hai
//                throw new ArithmeticException("This is an Arithmetic Exception!");     // Pre-defined Exception ko throw krrhe hai
//            }
//            catch(Exception e){
//                System.out.println(e.getMessage());    // jb hmne e.getMessage() daala to super.getMessage ne to hmko null return kiya aur baaki
//                System.out.println(e.toString());      // "I am getMessage()" print hogya.
//                System.out.println(e);           // jb sirf e print krte hai to toString() run hota hai
//                e.printStackTrace();
//                System.out.println("Finished");
//            }
//        }
//        System.out.println("Yes Finished");

//      throw keyword ko hmesha try-catch block me rhkna hota hai kyuki hmko uss Exception ko catch bhi krna hai.

//        System.out.println("Enter your age");
//        int age = sc.nextInt();
//
//        if(age>125){
//            try{
//                throw new MaxAgeException();
//            }
//            catch (Exception e){
//                System.out.println(e.getMessage());
//                System.out.println(e.toString());
//                System.out.println(e);
//                e.printStackTrace();
//            }
//        }

//        Handling a pre-defined Exception which was thrown by our method --->
//        try{
//            int a = divide(6, 0);
//            System.out.println(a);
//        }
//        catch(Exception e){
//            System.out.println("Exception hai bhai!!!");
//        }


//      Handling a Custom made Exception which was thrown by our method --->
//        try{
//            double r = area(-5);     // Negative value yaani ek exception idhar aayega.
//            System.out.println("Area of the Circle is: " + r);
//        }
//        catch(Exception e){
//            System.out.println(e.getMessage());
//            System.out.println(e.toString());
//        }

//      Finally Block --->

//        int a = 9;
//        int b = 0;
//
//        try{
//            int c = a/b;
//            System.out.println(c);
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
//        finally {
//            System.out.println("Finally Block");
//        }


//        int a = number();
//        System.out.println(a);

//        for (int i = 0;i<10;i++){
//            try{
//                int a = 5;
//                int b = 0;
//                if (i == 8){
//                    break;   // break lgane ke baad bhi finally chalega hi chalega ek aur baar.
//                }
//                System.out.println(a/b);
//            }
//            catch(Exception e){
//                System.out.println(e);
//            }
//            finally{
//                System.out.println("Finally Block");
//            }
//        }


//        Practice Set -->
//        int a = 10;
//        int b = 0;
//        try{
//            System.out.println(a/b);
//        }
//        catch (Exception e){
//            System.out.println(e);
//            System.out.println("Error hai Bhai!!");
//        }


//        try{
//            int a = 100;
//            int b = sc.nextInt();
//            System.out.println(a/b);
//        }
//        catch(ArithmeticException e){
//            System.out.println("HaHa!!");
//        }
//        catch(IllegalArgumentException e){
//            System.out.println("HeHe!!");
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }


//        int i;
//        for (i = 0;i<5;i++){
//            try{
//                System.out.println("Enter the index no.");
//                int index = sc.nextInt();
//                System.out.println(marks[index]);
//                break;
//            }
//            catch (Exception e){
//                System.out.println(e + "\n");
//            }
//        }
//        if (i == 5){
//            System.out.println("\nError");
//        }

        int i;
        for (i = 0;i<5;i++){
            try{
                System.out.println("Enter Index no.");
                int index = sc.nextInt();
                System.out.println(marks[index]);
                break;
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        if (i == 5){
            try{
                throw new MaxRetriesException();
            }
            catch(MaxRetriesException e){
                System.out.println("\n" + e.getMessage());
                System.out.println(e.toString());
            }
        }


//        try{
//            Q5();
//        }
//        catch (Exception e){
//            System.out.println("\n" + e.getMessage());
//            System.out.println(e.toString());
//        }


//        while(true){
//            try{
//                System.out.println("Enter Index ");
//                int a = sc.nextInt();
//                System.out.println(marks[a]);
//                break;
//            }
//            catch (Exception e){
//                System.out.println(e);
//            }
//        }



    }
}
