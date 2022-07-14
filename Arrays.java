package com.company;

import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
//        System.out.println("3 Ways to create Array!!");

//        int [] marks = new int[5];   // Declaration and memory allocation of an integer array

//        int [] marks;
//        marks = new int[5];          // Declaration and memory allocation in different line of an integer array

        int [] marks = {70, 56, 96, 78, 25};     // Declaration, memory allocation and initialization of an integer array together

        marks[0] = 100;
        marks[1] = 60;
        marks[2] = 70;
        marks[3] = 90;
        marks[4] = 86;
        System.out.println(marks[4]);  // Accessing array elements
//        int a = marks.length;
//        System.out.println(a);
        System.out.println(marks.length);

        float [] m1 = new float[5];
        m1[0] = 78.56f;
        m1[1] = 15.48f;
        m1[2] = 93.13f;
        m1[3] = 17.67f;
        m1[4] = 36.34f;
        System.out.println(m1[3]);
        System.out.println(m1.length);

        String [] names = new String[5];
        names[0] = "Churchil";
        names[1] = "Kshitij";
        names[2] = "Pradumn";
        names[3] = "Deepak";
        names[4] = "Vidit";
        System.out.println(names[2]);
        System.out.println(names.length);

        char [] alpha = new char [5];
        alpha[0] = 'A';
        alpha[1] = 'B';
        alpha[2] = 'C';
        alpha[3] = 'D';
        alpha[4] = 'E';
        System.out.println(alpha[1]);
        System.out.println(alpha.length);

        System.out.println("Displaying Array:");
        for (int i = 0;i<marks.length;i++){
            System.out.println(marks[i]);
        }

        System.out.println("Displaying Array in Reverse order:");
        for (int i = (marks.length)-1;i>=0;i--){
            System.out.println(marks[i]);
        }

        // Ek Array hai jisme sirf 2 elements hai, lekin har element apne aap me ek Array hai jiska size 3 hai. For [2][3] Array.

//        int[][] flats = new int[2][3];
//        flats[0][0] = 100;
//        flats[0][1] = 101;
//        flats[0][2] = 102;
//        flats[1][0] = 103;
//        flats[1][1] = 104;
//        flats[1][2] = 105;
//        System.out.println(flats[1][2]);
//        System.out.println(flats.length);     // Array ka Size 2 hai
//        System.out.println(flats[0].length);
//
//        for (int i = 0;i<flats.length;i++){
//            for (int j = 0;j<flats[i].length;j++){
//                System.out.print(flats[i][j]);
//                System.out.print(" ");
//            }
//        }

//        char [] alpha = new char[5];
//        alpha[0] = 'A';
//        System.out.println(alpha[0]);

//        float [] num = new float[5];
//        num[0] = 45.7f;
//        num[1] = 67.8f;
//        num[2] = 63.4f;
//        num[3] = 99.2f;
//        num[4] = 100.0f;
////
//        float sum = 0.0f;
//        for (int i = 0;i<num.length;i++){
//            sum = sum + num[i];
//        }
//        System.out.println(sum);

        Scanner sc = new Scanner(System.in);

//        int [] arr = new int[5];
//        arr[0] = 75;
//        arr[1] = 84;
//        arr[2] = 62;
//        arr[3] = 60;
//        arr[4] = 84;
//
//        System.out.println("\nWhich number you want to search:");
//        int num2 = sc.nextInt();
//
//        boolean isInArray = false;                // By default hmne isInArray ko false maan liya, abb isko prrof krna padega ki ye true hai(array ke andar hai ki nhi)
//        for (int i = 0;i<arr.length;i++) {
//            if (num2 == arr[i]) {
//                isInArray = true;    // upgrading the value of isInArray to true.
//                break;
//            }
//        }
//
//        if (isInArray)     // isInArray ki value for loop ke bhaar bach rhi hai kyuki hmne ise for loop ke scope ke upar declare kiya tha.
//            System.out.println(num2 + " is present in the array!!");
//        else
//            System.out.println(num2 + " is not present in the array!!");


        int [] num = new int[5];
        num[0] = 75;
        num[1] = 84;
        num[2] = -62;
        num[3] = 60;
        num[4] = 85;

//        int sum = 0;
//        for (int i = 0;i<num.length;i++){
//            sum = sum + num2[i];
//        }
//        float avg;
//        avg = sum/5f;
//        System.out.println("Average marks of Physics for 5 students is: " + avg);

//        int [][] arr1 = new int[2][3];
//        int [][] arr2 = new int[2][3];
//        int [][] arr3 = new int[2][3];
//        arr1[0][0] = 1;
//        arr1[0][1] = 2;
//        arr1[0][2] = 3;
//        arr1[1][0] = 4;
//        arr1[1][1] = 5;
//        arr1[1][2] = 6;

//        arr2[0][0] = 2;
//        arr2[0][1] = 6;
//        arr2[0][2] = 13;
//        arr2[1][0] = 3;
//        arr2[1][1] = 7;
//        arr2[1][2] = 1;
//
//        for (int i = 0;i<arr1.length;i++){
//            for (int j = 0;j<arr1[0].length;j++){
//                arr3[i][j] = arr1[i][j] + arr2[i][j];
//                System.out.print(arr3[i][j] + " ");
//            }
//            System.out.print("\n");
//        }
//        System.out.println(arr3[1][1]);

//        System.out.println("Printing in Reverse the given array: ");
//        for (int i = (arr1.length-1);i>=0;i--){
//            for (int j = (arr1[i].length-1);j>=0;j--){
//                System.out.println("arr1" + "[" + i + "]" + "[" + j + "]" + " = " + arr1[i][j]);
////                System.out.format("arr[%d][%d] = %d\n", i, j, arr1[i][j]);
//            }
//        }

        // Array reverse ka mtlb ye hota hai ki hm array ki value ko aapas me swap krte hai
        // Ek hota hai Array ko reverse krna hai aur dusra hota hai Array ko bas reverse me print krwa dena
        // Hm Array ko reverse krrhe hai -->
//        int [] arr = new int[6];
//        arr[0] = 1;
//        arr[1] = 2;
//        arr[2] = 3;
//        arr[3] = 4;
//        arr[4] = 5;
//        arr[5] = 6;

//        int temp;
//        for (int i = 0;i<(arr.length/2);i++){
//            temp = arr[i];
//            arr[i] = arr[(arr.length-1-i)];
//            arr[(arr.length-1-i)] = temp;
//        }

//        int temp;
//        for (int i = 0;i<(arr.length/2);i++){
//            temp = arr[(arr.length-1-i)];
//            arr[(arr.length-1-i)] = arr[i];
//            arr[i] = temp;
//        }
//
//        for (int i = 0;i<arr.length;i++){
//            System.out.println("arr" + "[" + i + "]" + " = " + arr[i]);
//        }
//        System.out.println(arr[4]);

        // Reversing a two 2-D Array--
//        int temp1;
//        for (int i = 0;i<arr1.length/2;i++){
//            for (int  j = 0;j<arr1[0].length;j++){
//                temp1 = arr1[i][j];
//                arr1[i][j] = arr1[(arr1.length-1-i)][(arr1[0].length-1-j)];
//                arr1[(arr1.length-1-i)][(arr1[0].length-1-j)] = temp1;
//            }
//        }
//
//        for (int i = 0;i<arr1.length;i++){
//            for (int j = 0;j<arr1[0].length;j++){
//                System.out.print(arr1[i][j] + " ");
//            }
//            System.out.print("\n");
//        }


//        int a = 5;
//        int b = 6;
//        int temp;
//        temp = b;
//        b = a;
//        a = temp;
//        System.out.println(a);
//        System.out.println(b);


//        System.out.println("Actual Array is: ");
//        for (int i = 0;i<num.length;i++)
//            System.out.print(num[i] + " ");
//
////        Bubble Sort
//        for (int i = 0;i<(num.length-1);i++){
//            for (int j = 0;j<((num.length-1)-i);j++){
//                if (num[j] > num[j+1]){
//                    int temp;
//                    temp = num[j];
//                    num[j] = num[j+1];
//                    num[j+1] = temp;
//                }
//            }
//        }
//
//        System.out.println("\n\nSorted Array is: ");
//        for (int i = 0;i<num.length;i++){
//            System.out.print(num[i] + " ");
//        }

        int max = num[0];                    // hmne max ko by default num[0] pr set krdiya hai. Abb isko proof krna padega loop traverse krke ki num[0] se bada bhi koi
        for (int i = 0;i< num.length;i++){   // element hai.
            if (num[i]>max)
                max = num[i];
        }
        System.out.println("\n\nMaximum number in array is: " + max);

//        int min = num[0];
//        for (int i = 0;i< num.length;i++){
//            if (num[i]<min)
//                min = num[i];
//        }
//        System.out.println("\n\nMinimum Value in array is: " + min);

        int [] arr = {7, 8, 9, 10, 11};
//        int [] arr = {47, 45, 33, 12, 11};


        boolean isSorted = true;
        for (int i = 0;i<arr.length-1;i++){
            if (arr[i] > arr[i+1]) {
                isSorted = false;
                break;
            }
        }

        if (isSorted)
            System.out.println("Array is Sorted!!");
        else
            System.out.println("Array is not Sorted!!");


//        Scanner sc = new Scanner(System.in);
//        int [] arr1 = new int[5];
//        System.out.println("Enter the array of size 5:");
//        for (int i = 0;i<arr1.length;i++){
//            arr1[i] = sc.nextInt();
//        }
//
//        boolean isSorted = true;
//
//        // Checking for ascending order array:
//        for (int i = 0;i<arr1.length-1;i++){
//            if (arr1[i] > arr1[i+1]){
//                isSorted = false;
//                break;
//            }
//        }

        // Checking for descending order array:
//        for (int i = 0;i<arr1.length-1;i++){
//            if (arr1[i] < arr1[i+1]){
//                isSorted = false;
//                break;
//            }
//        }
//
//        if (isSorted)
//            System.out.println("Array is Sorted!!");
//        else
//            System.out.println("Array is not Sorted!!");

    }
}
