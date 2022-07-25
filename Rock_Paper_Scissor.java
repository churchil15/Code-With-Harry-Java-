package com.company;

import java.util.Scanner;
import java.util.Random;

public class Rock_Paper_Scissor {
    public static void main(String[] args) {
        System.out.println("This is a Rock, Paper and Scissor Game...!!!\n");

        System.out.println("Press 0 for Paper.....");
        System.out.println("Press 1 for Rock.....");
        System.out.println("Press 2 for Scissor.....");

        // Objects Creation:
        Scanner sc = new Scanner(System.in);
        Random r = new Random();


        for (int i = 0;i<5;i++) {
            // First User will choose:
            int user = sc.nextInt();
            System.out.println("User choose: " + user);

            // After User, Computer will Choose:
            int comp = r.nextInt(3);                    // 0 se lekar bound - 1 tk tumko kuch bhi mil skta hai.
            System.out.println("Computer chose: " + comp);

            // Displaying Computer Choice:
            if (comp == 0)
                System.out.println("Computer choose Paper");
            else if (comp == 1)
                System.out.println("Computer choose Rock");
            else
                System.out.println("Computer choose Scissor");

            // Checking for the Winner:
            if ((user == 0 && comp == 1) || (user == 1 && comp == 2) || (user == 2 && comp == 0))
                System.out.println("User Win");

            else if ((user == 0 && comp == 0) || (user == 1 && comp == 1) || (user == 2 && comp == 2))
                System.out.println("Its a Tie");

            else
                System.out.println("Computer Win");
        }

    }
}
