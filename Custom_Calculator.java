package com.company;

import java.util.Scanner;

class InvalidInputException extends Exception{
    @Override
    public String toString(){
        return "Check your Input Again!!";
    }

    @Override
    public String getMessage(){
        return "Invalid Input Entered!!";
    }
}

class InvalidDivisionException extends Exception{
    @Override
    public String toString(){
        return "Division by 0 is not possible";
    }

    @Override
    public String getMessage(){
        return "Invalid Division!!";
    }
}

class MaxInputException extends Exception{
    @Override
    public String toString(){
        return "Please enter smaller value";
    }

    @Override
    public String getMessage(){
        return "Entered Value is greater than 100000";
    }
}

class MaxMultiplierReachedException extends Exception{
    @Override
    public String toString(){
        return "Multiplication is not possible!!";
    }

    @Override
    public String getMessage(){
        return "Entered value is greater than 7000";
    }
}
public class Custom_Calculator {
    public static void main(String[] args) {
        System.out.println("**************   Welcome to your own Custom Calculator   **************" + "\n");
        System.out.println("Choose from the following operations: ");
        System.out.println("Press 1 for '+' --> Addition");
        System.out.println("Press 2 for '-' --> Subtraction");
        System.out.println("Press 3 for '*' --> Multiplication");
        System.out.println("Press 4 for '/' --> Division" + "\n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Choice: ");
        int choice = sc.nextInt();

        switch (choice){
            case 1: {
                System.out.print("Enter first and second number: ");

                try{
                    int num1 = sc.nextInt();
                    int num2 = sc.nextInt();

                    if (num1 == 8 || num2 == 8 || num1 == 9 || num2 == 9){
                        try{
                            throw new InvalidInputException();
                        }
                        catch (InvalidInputException I){
                            System.out.println(I.getMessage());
                            System.out.println(I.toString());
                            break;
                        }
                    }

                    if (num1 > 100000 || num2 > 100000){
                        try{
                            throw new MaxInputException();
                        }
                        catch (MaxInputException m) {
                            System.out.println(m.getMessage());
                            System.out.println(m.toString());
                            break;
                        }
                    }
                    System.out.println("Addition is: " + (num1 + num2));
                }
                catch (Exception e){
                    System.out.println(e);
                }
                break;
            }

            case 2: {
                System.out.println("Enter first and second number");

                try{
                    int num1 = sc.nextInt();
                    int num2 = sc.nextInt();

                    if (num1 == 8 || num2 == 8 || num1 == 9 || num2 == 9){
                        try{
                            throw new InvalidInputException();
                        }
                        catch (InvalidInputException I){
                            System.out.println(I.getMessage());
                            System.out.println(I.toString());
                            break;
                        }
                    }

                    if (num1 > 100000 || num2 > 100000){
                        try{
                            throw new MaxInputException();
                        }
                        catch (MaxInputException m){
                            System.out.println(m.getMessage());
                            System.out.println(m.toString());
                            break;
                        }
                    }
                    System.out.println("Subtraction is: " + (num1 - num2));
                }
                catch (Exception e){
                    System.out.println(e);
                }
                break;
            }

            case 3: {
                System.out.println("Enter first and second number: ");

                try{
                    int num1 = sc.nextInt();
                    int num2 = sc.nextInt();

                    if (num1 == 8 || num2 == 8 || num1 == 9 || num2 == 9){
                        try{
                            throw new InvalidInputException();
                        }
                        catch (InvalidInputException I){
                            System.out.println(I.getMessage());
                            System.out.println(I.toString());
                            break;
                        }
                    }

                    if (num1 > 100000 || num2 > 100000){
                        try{
                            throw new MaxInputException();
                        }
                        catch (MaxInputException m){
                            System.out.println(m.getMessage());
                            System.out.println(m.toString());
                            break;
                        }
                    }

                    if (num1 > 7000 || num2 > 7000){
                        try{
                            throw new MaxMultiplierReachedException();
                        }
                        catch (MaxMultiplierReachedException m){
                            System.out.println(m.getMessage());
                            System.out.println(m.toString());
                            break;
                        }
                    }

                    System.out.println("Multiplication is: " + (num1 * num2));
                }
                catch (Exception e){
                    System.out.println(e);
                }
                break;
            }

            case 4: {
                System.out.println("Enter first and second number");

                try{
                    int num1 = sc.nextInt();
                    int num2 = sc.nextInt();

                    if (num1 == 8 || num2 == 8 || num1 == 9 || num2 == 9){
                        try{
                            throw new InvalidInputException();
                        }
                        catch (InvalidInputException I){
                            System.out.println(I.getMessage());
                            System.out.println(I.toString());
                            break;
                        }
                    }

                    if (num2 == 0){
                        try{
                            throw new InvalidDivisionException();
                        }
                        catch (InvalidDivisionException I){
                            System.out.println(I.getMessage());
                            System.out.println(I.toString());
                            break;
                        }
                    }

                    if (num1 > 100000 || num2 > 100000){
                        try{
                            throw new MaxInputException();
                        }
                        catch (MaxInputException m){
                            System.out.println(m.getMessage());
                            System.out.println(m.toString());
                            break;
                        }
                    }

                    System.out.println("Division of " + num1 + "/" + num2 + " is " + (num1/num2));
                }
                catch (Exception e){
                    System.out.println(e);
                }
                break;
            }

            default:
                System.out.println("Invalid Choice!!!");
        }

        System.out.println("\nThanks for using this calculator!!");
    }
}