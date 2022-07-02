package com.company;

import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {

        String name1 = "Churchil";
        System.out.println(name1);

        String name2;
        name2 = "Churchil";
        System.out.println(name2);

        String name3;
        name3 = new String("Churchil");
        System.out.println(name3);

//       int a = 6;
//        float b = 5.6456f;
//        System.out.printf("The value of a is %d and b is %.2f\n", a, b);
//        System.out.format("The value of a is %d and b is %f\n", a, b);

        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        System.out.println(str);

        String name = "churchil";
        int value = name.length();
        String lower = name.toLowerCase();
        String upper = name.toUpperCase();
        System.out.println(upper);

        String trim = name.trim();
        System.out.println(trim);

//        byte b = 3;
        String ss = name.substring(3);
        System.out.println(name.substring(5));
        System.out.println(name.substring(1, 7));
        System.out.println(ss);

//        String replace = name.replace('h', 'a');     // Character ko Character se replace kiya hai
//        String replace = name.replace("ch", "ph");   // Substring ko Substring se replace kiya hai
//        String replace = name.replace("h", "oo");    // Character ko Substring se replace kiya hai
        String replace = name.replace("ch", "p");    // SubString ko Character se replace kiya hai
        System.out.println(replace);

//        boolean b1 = name.startsWith("ch");
        System.out.println(name.startsWith("chu"));
        System.out.println(name.endsWith("il"));

        System.out.println(name.charAt(6));
        System.out.println(name.indexOf("h"));
        System.out.println(name.indexOf("h", 3));
        System.out.println(name.lastIndexOf("h"));
        System.out.println(name.lastIndexOf("h", 3));
//
        System.out.println(name.equals("Churchil"));        // Case sensitivity follows here
        System.out.println(name.equalsIgnoreCase("Churchil"));   // Case sensitivity ignores here

//        System.out.println("Enter a string");
//        String str = sc.nextLine();
//        System.out.println(str.toLowerCase());

//        String str = sc.nextLine();
//        System.out.println(str.replace(" ", "_"));

        String letter = "Dear <|name|>, Thanks a lot";
        System.out.println(letter.replace("<|name|>", "Churchil"));
//        System.out.println(letter);

        String str = "This string contains double and  triple   spaces";
        int detect = str.indexOf("  ");
        int detect2 = str.indexOf("   ");
        System.out.println(detect);
        System.out.println(detect2);

//        System.out.println(str.indexOf("  "));
//        System.out.println(str.indexOf("   "));

        String letter2 = "Dear Churchil,\n\tYou are a good boy.\n\tKeep believing in yourself!!";
        System.out.println(letter2);

    }
}
