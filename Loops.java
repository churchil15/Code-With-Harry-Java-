package com.company;

import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
//        System.out.println("Welcome to Loops!!!");

//        int i = 0;                   // initialization
//        while (i<3) {                // condition
//            System.out.println(i);
//            i++;                     // incrementation
//        }
//        System.out.println(i);
//        System.out.println("Finish running while loop");

//        int a = 100;
//        while(a<=200){
//            System.out.println(a);
//            a++;
//        }

        int a = 1;                    // initialization
        do {
            System.out.println(a);
            a++;                      // incrementation
        }while(a<=5);                 // condition
        System.out.println(a);

        Scanner sc = new Scanner(System.in);
//
//        System.out.println("How many natural numbers do you want to be printed: ");
//        int natural = sc.nextInt();
//
//        int b = 1;
//        do {
//            System.out.println(b);
//            b++;
//        }while(b<=natural);

//        int i;
//        for (i=1;i<=10;i++){
//            System.out.println(i);
//        }
//        System.out.println(i);

        // Jaise hi control Loop ke bhaar ayega to "int i" variable jo for loop ke andar declare aur initialize kiya gya hai vo destroy ho jayega
        // Usko dubara loop ke scope ke bhaar use nhi krskte kyuki abb vo hai hi nhi.

//        System.out.println("Enter no. of odd numbers you want to be printed:");
//        int num = sc.nextInt();
//
//
//        for (int i=0; i<num ;i++){
//            System.out.println(2*i+1);   // 2n+1 for Odd Numbers
//        }

//        for (int i=5;i>0;i--){
//            System.out.println(i);
//        }
//
//        System.out.println("How many natural numbers you want to print in reverse order:");
//        int num = sc.nextInt();
//
//        for (int i = num;i>0;i--){
//            System.out.println(i);
//        }

        for(int i = 0;i<5;i++){
            System.out.println(i);
            System.out.println("Java is Great!");
            if (i==2) {
                System.out.println("Breaking the loop");
                break;
            }
        }
        System.out.println("Loop ends here");

//        int i = 0;
//        while(i<5){
//            System.out.println(i);
//            System.out.println("Java is Great!");
//            if (i==2) {
//                System.out.println("Breaking the loop");
//                break;
//            }
//            i++;
//        }

//        int i = 0;
//        do {
//            System.out.println(i);
//            System.out.println("Java is Great!");
//            if (i==2) {
//                System.out.println("Breaking the loop");
//                break;
//            }
//            i++;
//        }while (i<5);
//        System.out.println("Loop ends year!!");

        for(int i = 0;i<5;i++){
            if (i==2) {
                System.out.println("Breaking the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is Great!");
        }
        System.out.println("Loop ends here");

//        int i = 0;
//        do {
//            i++;
//            if (i==2) {
//                System.out.println("Breaking the loop");
//                continue;
//            }
//            System.out.println(i);
//            System.out.println("Java is Great!");
//
//        }while (i<5);
//        System.out.println("Loop ends here!!");

//        int i = 0;
//        while(i<5){
//            i++;
//            if (i==2) {
//                System.out.println("Breaking the loop");
//                continue;
//            }
//            System.out.println(i);
//            System.out.println("Java is Great!");
//
//        }

//        for (int i = 1;i<5;i++){               // line changing loop
//            for (int j = 1;j<=5-i;j++) {       // star printing loop
//                System.out.print("* ");
//            }
//            System.out.print("\n");
//        }

//        for (int i = 1;i<5;i++){
//            for (int j = 0;j<5-i;j++){
//                System.out.print("* ");
//            }
//            System.out.print("\n");
//        }

//        System.out.println("Multiplication table of: ");
//        int num = sc.nextInt();
//
//        for (int i = 1;i<=10;i++){
//            System.out.println(" " + num + " * " + i + " = " + num*i);
//        }
//
//        System.out.println("Multiplication Table in Reverse Order of: ");
//        int num2 = sc.nextInt();
//
//        for (int i = 10;i>0;i--){
//            System.out.println(" " + num2 + " * " + i + " = " + num2*i);
//        }

//        System.out.println("Factorial of:");
//        int num3 = sc.nextInt();

//        for (int i = num3-1;i>=1;i--){
//            num3 = num3*i;
//        }
//        System.out.println(num3);

//        int fact = 1;           // initialization 1 se tb krte hai jb multiplication ho rha hota hai.
//        for (int i = 1;i<=num3;i++){
//            fact = fact * i;
//        }
//        System.out.println(fact);    // fact ki value for loop ke bhaar bach rhi hai kyuki fact ko for loop ke scope ke upar declare kiya tha.

//        int fact = 1;
//        for (int i = num3;i>=1;i--){
//            fact = fact * i;
//        }
//        System.out.println(fact);


//        int i = num3-1;
//        while(i>=1){
//            num3 = num3*i;
//            i--;
//        }
//        System.out.println(num3);

//        2nd way of doing Factorial:-
//        int i = 1;
//        int fact = 1;
//        while(i<=num){
//            fact = fact * i;
//            i++;
//        }
//        System.out.println(fact);

//        int i = 1;
//        while(i<5){
//            int j = 1;   // Re-initializing j
//            while(j<=5-i){
//                System.out.print("* ");
//                j++;
//            }
//            i++;
//            System.out.print("\n");
//        }

        System.out.println("Enter number of even no. you want to add: ");
        int n = sc.nextInt();
//
//        int sum = 0;                 // initialization 0 se tb krte hai jb addition krna hota hai.
//        for (int i = 0;i<n;i++){
////            System.out.println(2*i);
//            sum = sum + (2*i);
//        }
//        System.out.println("Sum of first " + n + " even no. is " + sum);

//        int num = 8;
//        int sum = 0;
//        for (int i = 1;i<=10;i++){
////            System.out.println(num*i);
//            sum = sum + num*i;
//        }
//        System.out.println(sum);

        int sum2 = 0;
        int i = 0;
        while(i<n){
            sum2 = sum2 + (2*i);
            i++;
        }
        System.out.println(sum2);
    }
}
