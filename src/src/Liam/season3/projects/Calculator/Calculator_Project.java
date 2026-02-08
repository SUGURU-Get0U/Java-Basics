package Liam.season3.projects.Calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator_Project implements IOperation_able {
    public boolean isNumber = true;
    public int n1;
    public int n2;
    private double result;
    protected String operation;
    public String status;

    Calculator_Project(int n1, int n2 , String operation){
        this.n1 = n1;
        this.n2 = n2;
        this.operation = operation;
    };

    void PrintWelcomeMessage(){
        System.out.println("**  Welcome to the calculator using java classes **");
        System.out.println("-------------------------------------------------------");
    }


    public String getOperator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the operator: + - * /  ");
        return this.operation = scanner.next();
    };

    @Override
    public double getResult() {
        Scanner scanner = new Scanner(System.in);
        getOperator();
        // We use the arrow syntax (->) for cleaner switch expressions in modern Java
        return switch (operation) {
            case "+", "plus"     -> n1 + n2;
            case "-", "minus"    -> n1 - n2;
            case "*", "multiply" -> n1 * n2;
            case "/", "divide"   -> (n2 != 0) ? (double) n1 / n2 : 0; // Added a quick check for division by zero!
            default -> {
                System.out.println("Unknown operator: " + operation);
                yield 0;
            }
        };
    }
};



