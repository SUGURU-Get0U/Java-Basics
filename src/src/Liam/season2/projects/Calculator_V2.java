package Liam.season2.projects;

import java.util.Scanner;

public class Calculator_V2 {
    static void main(String[] args) {
        // making a calculator, using at least 2 methods
        // - evaluating the operation
        // - continuing the program
        System.out.println("=================================");
        System.out.println("Welcome to Calculator V2.0");
        System.out.println("=================================");

        Show_ops("please chose the operation you will be doing: ");
        Scanner scanner = new Scanner(System.in);
        String op = scanner.next();

        if (op.isEmpty()) {
            while (op.isEmpty()){
            Show_ops("Operation is blank, please type one of these: ");
            op = scanner.next();
            }
            Scan_UserInput(scanner, op);
        } else {
            Scan_UserInput(scanner,op);
            if (continueProgram() == 0) {
                System.out.println("Continuing...");
            } else {
                System.out.println("Thank you for using the calculator");
            }
        }
    }

    private static void Scan_UserInput(Scanner scanner, String op) {
        System.out.println("Enter the numbers: ");
        System.out.println("1- : ");
        int n1 = scanner.nextInt();
        System.out.println("2- : ");
        int n2 = scanner.nextInt();
        System.out.println("result of: " + n1 + op + n2 + "= " + evalOps(n1, n2, op));
    }

    private static void Show_ops(String x) {
        System.out.println(x);
        System.out.println("sum");
        System.out.println("sub");
        System.out.println("multiply");
        System.out.println("division");
    }

    private static int evalOps(float x, float y, String operation) {

        float result;
        switch (operation) {
            case "sum":
                result = x + y;
                return (int)result;
            case "sub":
                result = x - y;
                return (int)result;
            case "multiply":
                result = x * y;
                return (int)result;
            case "division":
                result = x / y;
                if (result == 0) {
                    return 0;
                } else {
                return (int)result;
                }
            default: return 1;

        }
    }
    private static int continueProgram() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("do you wish to continue: [y/n]");

        String endProgram = scanner.next();
        // enhanced switch case.
        return switch (endProgram.toLowerCase()) {
            case "y" -> 1;
            case "n" -> 0;
            default -> 2;
        };
    }}

