package Liam.season1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TWO BARS IS A SINGLE LINE COMMENT
        /* A BAR WITH A STAR
        * IS
        * A
        * MULTILINE COMMENT*/

        /* VARIABLES */

        // datatype var_name; Declaration
        // var_type var_name = value_of_var; --> INITIALIZATION (declaration + value Assignment)

        //int brainRot; // Integers can store Positive and Negative values
        //brainRot = 67;

        // CHARS and STRINGS!
        //char sex = 'y'; // a char is identified by single quotation marks ' '
        //String skibidi = "What is this diddy blud doing on the calculator?"; // While STRINGS are Identified by double quotation marks " "

        //System.out.println("Skibidi skibidi hawk tuah hawk");


        // FISRT ESSAY
        // CREATE A CALCULATOR

        /* READ THE OPERATION FIRST*/
        // THEN READ THE TWO NUMBER
        Scanner scanner = new Scanner(System.in);
        int result;
        boolean CalcRunning = true;
        String status = "y";

        System.out.println("===== WELCOME TO THE CALCULATOR =====");

        while (status.equals("y")) {
            System.out.println("Please enter the operation you will be doing (*, /, +, -): ");
            String operation = scanner.next();

            System.out.println("Please enter the First Number: ");
            int n1 = scanner.nextInt();

            System.out.println("Please enter the Second Number: ");
            int n2 = scanner.nextInt();

            switch (operation) {
                case "+", "plus":
                    result = n1 + n2;
                    System.out.println("The result is" + result);
                    System.out.println("do you wish to continue? [y][n]: ");
                    status = scanner.next();
                    if (status.equals("n")) {
                        System.out.println("Closing Calculator...");
                        break;
                    } else {
                        continue;
                    }


                case "-", "minus":
                    result = n1 - n2;
                    System.out.println("The result is" + result);
                    System.out.println("do you wish to continue? [y][n]: ");
                    status = scanner.next();
                    if (status.equals("n")) {
                        System.out.println("Closing Calculator...");
                        break;
                    } else {
                        continue;
                    }

                case "*", "multiply":
                    result = n1 * n2;
                    System.out.println("The result is" + result);
                    System.out.println("do you wish to continue? [y][n]: ");
                    status = scanner.next();
                    if (status.equals("n")) {
                        System.out.println("Closing Calculator...");
                        break;
                    } else {
                        continue;
                    }

                case "/", "divide":
                    result = n1 / n2;
                    System.out.println("The result is" + result);
                    System.out.println("do you wish to continue? [y][n]: ");
                    status = scanner.next();
                    if (status.equals("n")) {
                        System.out.println("Closing Calculator...");
                        break;
                    } else {
                        continue;
                    }

                default:
                    System.out.println("Waiting for input...");
                    break;
            }
        }
    }
}