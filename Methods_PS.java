package com.company;

import java.util.Scanner;
public class Methods_PS {

    static void table(int num){
        for (int i = 1;i<=10;i++){
            System.out.println(num + " * " + i + " = " + num*i);
        }
    }

    static void pattern_iteration(int a){
        for (int i = 0;i<a;i++){
            for (int j = 1;j<=i+1;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    static int add_recursion(int num2){
        if (num2 == 1)
            return 1;
        else
            return num2 + add_recursion(num2-1);
    }

    static void pattern2_iteration(){
        for (int i = 1;i<5;i++){
            for (int j = 1;j<=5-i;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    static void fibonacci_iterative(int num3){
        int first = 0;
        int second = 1;
        int next;
        for (int i = 0;i<num3;i++){
            if (i<=1)
                next = i;
            else {
                next = first + second;
                first = second;
                second = next;
            }
            System.out.print(next + "\t");
        }
    }

    static int fibonacci_recursive(int term){
        if (term == 1)
            return 0;
        else if (term == 2)
            return 1;
        else
            return fibonacci_recursive(term-1) + fibonacci_recursive(term-2);
    }

    static void average(int ...arr){
        int sum = 0;
        for (int i = 0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        System.out.println("Average is: " + sum/arr.length);
    }

    static void pattern2_recursion(int a){
        if (a==1)
            System.out.println("* ");
        else {
            for (int i = 0; i < a; i++) {
                System.out.print("* ");
            }
            System.out.print("\n");
            pattern2_recursion(a-1);
        }
    }

    // To display the patterns in a recursive way (My Way)
    static void pattern_recursion(int a){
        int i;
        for (i = 1;i<=a;i++){
            System.out.print("* ");
        }
        System.out.print("\n");
        if ((i==(a+1)) && i!=5)
            pattern_recursion(a+1);
    }

    // More optimal method to display the pattern
    static void pattern_recursion2(int a){
        if (a>0){
            pattern_recursion2(a-1);    // Stars to print honge lekin baad me jab ye saari recursive calls resolve ho jayengi.
            for (int i = 0;i<a;i++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    static float celsius_to_fahrenheit(float temp_celsius){
        return (temp_celsius * (9.0f/5.0f)) + 32;
    }

    static int add_iterative(int num2){
        int sum = 0;
        for (int i = 1;i<=num2;i++){
            sum = sum + i;
        }
        return sum;
    }

    static int factorial_recursion(int num){
        if (num == 1)
            return 1;
        else
            return num * factorial_recursion(num-1);
    }

    public static void main(String[] args) {
        System.out.println("Practice Questions on JAVA Methods...!!!\n");
        Scanner sc = new Scanner(System.in);

//        System.out.print("Multiplication Table of: ");
//        int num = sc.nextInt();
//        table(num);

//        pattern_iteration(4);

//        System.out.print("How many first natural numbers you want to add: ");
//        int num2 = sc.nextInt();
//        System.out.println("Sum of first " + num2 + " natural numbers is " + add_recursion(num2));
//        System.out.println("Sum of first " + num2 + " natural numbers is " + add_iterative(num2));

//        pattern2_iteration();

//        System.out.print("How many terms you want in the fibonacci series: ");
//        int num3 = sc.nextInt();
//        fibonacci_iterative(num3);

//        average(45,53,27,39);

        pattern2_recursion(4);

//        pattern_recursion(1);
//        pattern_recursion2(4);

//        System.out.print("Enter temperature in Celsius: ");
//        float temp_celsius = sc.nextFloat();
//        System.out.print("Temperature in Fahrenheit is: " + celsius_to_fahrenheit(temp_celsius));

//        System.out.println(factorial_recursion(5));

//        System.out.print("Which term you want in fibonacci series: ");
//        int a = sc.nextInt();
//        System.out.println(a + "th term of the series is " + fibonacci_recursive(a));

    }
}
