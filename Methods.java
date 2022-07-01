package com.company;

import java.util.Scanner;
public class Methods {

     static int logic(int x, int y){        // Custom Method (Method Definition)
        int z;                              // Ye bina Class ka Object bnaye Call kiya ja skta hai
        if (x>y) {
            z = x + y;
        }
        else {
            z = (x + y) * 5;
        }
        return z;
    }

    int logic2(int x, int y){            // Custom Method (Method Definition)
        int z;                           // Isko Call krne ke liye Class ka Object bnana padega
        if (x>y) {
            z = x + y;
        }
        else {
            z = (x + y) * 5;
        }
        return z;
    }

    static void jokes(){
        System.out.println("I invented a new word!\n" +
                "Plagiarism!");
    }

    static void change(int [] arr){
         arr[0] = 98;
    }

    static void foo(){
        System.out.println("\nGood Morning");
    }

    static void foo(int a){
        System.out.println("Good Morning " + a);
    }

    static void foo(int a, int b){
        System.out.println("Good Morning " + a);
        System.out.println("Good Morning " + b);
    }

//    static int sum(int a, int b){
//         return a+b;
//    }
//
//    static int sum(int a, int b, int c){
//         return a+b+c;
//    }
//
//    static int sum(int a, int b, int c, int d){
//         return a+b+c+d;
//    }

    static int sum(int ...arr){                     // VarArg (Variable Arguments) method.
         int result = 0;
         for (int i = 0;i<arr.length;i++){
             result = result + arr[i];
         }
         return result;
    }

//    static int sum(int x, int ...arr){             // VarArgs (Variable Arguments) method with at least one argument needed to be passed.
//         int result = x;
//         for (int i = 0;i<arr.length;i++){
//             result = result + arr[i];
//         }
//         return result;
//    }

    static int factorial(int a){
         int fact = 1;
         for (int i = a; i > 0; i--) {
             fact = fact * i;
         }
         return fact;
    }

    static int fact(int a){
         if ((a == 0) || (a == 1))
             return 1;
         else
             return a * fact(a-1);
    }

    public static void main(String[] args) {             // Program ka execution to main method se start hoga.
//        System.out.println("Welcome to Methods!!");    // Apan ke apna method main method se alag krke bnana hoga, lekin class ke andar hi.
                                                         // Baad me hm apne method ko situation ke hisaab se call krte rhenge.

//        int a = 5;
//        int b = 7;
//        int c;
//        if (a>b)
//            c = a+b;
//        else
//            c = (a+b)*5;

//        int a1 = 11;
//        int b1 = 7;
//        int c1;
//        if (a1>b1)
//            c1 = a1+b1;
//        else
//            c1 = (a1+b1)*5;

        int c = logic(5, 7);         // Method Calling
        int c1 = logic(2, 1);        // Method Calling
        System.out.println(c);
        System.out.println(c1);

        Methods obj = new Methods();       // Object Creation
        int d = obj.logic2(5,7);     // Method Calling using Object
        int d1 = obj.logic2(2,1);    // Method Calling using Object
        System.out.println(d);
        System.out.println(d1);


        jokes();         // Method Calling

        int [] arr = {52, 73, 77, 89, 98, 94};
        change(arr);      // Hmne arr ko nhi bheja hai, na hi arr ki koi copy wagerah bheji hai. Hmne arr ka address/reference bhej diya hai method me.
        System.out.println(arr[0]);
        System.out.println(arr[1]);

        for (int i = 0;i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }

        foo();
        foo(15);
        foo(20, 30);

        System.out.println("The sum of 4 is: " + sum(4));
        System.out.println("The sum of 4 and 5 is: " + sum(4, 5));
        System.out.println("The sum of 3, 4 and 5 is: " + sum(3, 4, 5));
        System.out.println("The sum of 2, 3, 4 and 5 is: " + sum(2, 3, 4, 5));
        System.out.println("The sum of 2, 3, 4 and 5 is: " + sum(1, 2, 3, 4, 5));
        System.out.println("The sum of Nothing is: " + sum());  // Array in our method will be empty in this case because we have not send anything.

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int a = sc.nextInt();

        System.out.println("Factorial: " + factorial(a));      // iterative approach
        System.out.println("Factorial: " + fact(a));           // recursive approach

//        int first = 0;
//        int second = 1;
//        int next;
//        for (int i = 0;i<a;i++){
//            if (i<=1)
//                next = i;
//            else{
//                next = first + second;
//                first = second;
//                second = next;
//            }
//            System.out.print(next + "\t");
//        }


    }
}
