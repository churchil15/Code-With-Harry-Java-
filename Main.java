package com.company;  //package in java is used to group related classes. In python packages were used to group related modules and modules are the
                      //ones which contains methods
import java.util.Scanner;
public class Main {   // Classes similar tarah ke functions ka collection hoti hai.

    public static void main(String[] args) {    //ye hmara main function hai. Program execution yahi se start hoga
        // write your code here                 //static ka mtlb ye hai ki hm bina iss class ka koi object bnaye iss function ko run krske
//        System.out.println("The sum of these numbers are:");
//        int a = 5;
//        int b = 1;
//        int c = 4;
//        int d = a + b + c;
//        System.out.println(d);
//        byte age = 23;
//        int a = 34;
//        short aa = 20;
//        long ageDino = 7898122122l;
//        char b = 'C';
//        float c = 10.1f;
//        double d = 4.66;
//        System.out.println(ageDino);
//        boolean name = true;
//        System.out.println(c);
//        String str = "Churchil";
//        System.out.println(str);
//        System.out.println("It Works!");
//        System.out.println("Taking input from the user...");
//        Scanner sc = new Scanner(System.in);  //System.in ka mtlb hai ki hm keyboard ke input ko lena chahte hai
//        System.out.println("Enter number 1");
//        int a = sc.nextInt();
//        System.out.println("Enter number 2");
//        int b = sc.nextInt();
//        int sum = a + b;
//        System.out.println("The Sum of these Numbers is : ");
//        System.out.println(sum);
//        boolean b1 = sc.hasNextInt();
//        System.out.println(b1);
//        String str = sc.nextLine();    // nextLine() is used to take a character or a string or a line from keyboard
//        String str = sc.next();        // next() is used to take a character or a string from keyboard
//        System.out.println(str);



//        int a = 4;
//        int b = 6 % a;  // Modular Operator which returns the remainder after division
//        System.out.println(b);

//        int a = 6*5-34/2;
//        int b = 60/5-34*2;
//        System.out.println(b);

//        int a = (x-y)/2;
//        int k = (b*b - 4*a*c)/(2*a);
//        System.out.println(k);

//        int i = 56;
//        System.out.println(i++); // 56
//        System.out.println(i); // 57
//        System.out.println(++i); // 58
//        System.out.println(i); // 58

//        int y = 7;
//        int x = y++*8;
//        System.out.println(x);
//        System.out.println(y);

//        float a = 7/4.0f*9/2.0f;
//        System.out.println(a);

//        float b = (v*v - u*u)/(2*a*S);
//        int x = 7;
//        int a = 7*49/7+35/7;
//        System.out.println(a);

//        System.out.println("Enter your Percentage");
//        float a = sc.nextFloat();
//        System.out.println(a+8.0f + "%");

//        char grade = 'B';
//        grade = (char)(grade + 3);
//        System.out.println(grade);

//        int a = 50;
//        System.out.print("Enter a number: ");
//        int b = sc.nextInt();
//        System.out.println(b>8);

//      Program to Print Prime numbers b/w 1 - 10:
        int temp;

        for (int i = 0;i<=10;i++){
            if (i == 1 || i == 0 ){
                continue;
            }

            temp = 1;
            for (int j = 2;j<=i/2;j++){
                if (i%j == 0)
                {
                    temp = 0;
                    break;
                }
            }
            if (temp == 1){
                System.out.println(i);
            }
        }


    }
}

//              ***CHAPTER - 1***
// formula me divide by 2 krne ka logic ye hai ki hmko ek bit km krni hai
// kyuki vo bit use hoti hai ye denote krne ke liye ki no. positive hai ya negative

// pheli bit ye decide krti hai ki no. positive hai ya negative
// agar first bit '0' hai --> positive no.
// agar first bit '1' hai --> negative no.

