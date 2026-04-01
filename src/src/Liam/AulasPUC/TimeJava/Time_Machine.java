package Liam.AulasPUC.TimeJava;

import java.lang.annotation.AnnotationTypeMismatchException;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
* Escreva uma aplicação em Java que informe a data correspondente a N minutos no futuro
* (com respeito ao dia e tempo corrente), sendo N um valor inteiro positivo fornecido pelo usuário.
* Devem ser entregues os arquivos contendo o código fonte.
*
*
* */

public class Time_Machine {
    public static void main(String[] args) {
        int inputed_Number;
        Scanner scanner = new Scanner(System.in);
        LocalDateTime dateTime = LocalDateTime.now();
        boolean is_int = true;


        // formatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
        String newTime = dateTime.format(formatter);

        System.out.println("Now its: " + newTime);
        while (is_int) {
            try {
                System.out.println("Type in a number (it has to be an integer)");
                inputed_Number = scanner.nextInt();

                String newFormattedCalculatedTime = getString(dateTime, inputed_Number, formatter);
                System.out.println("The new time is: " + newFormattedCalculatedTime);
            } catch (InputMismatchException error) {
                System.out.println("The number you typed was not an Integer and caused the error: " + error);
                System.out.println("Please enter in an Integer");
                is_int = false;
            }

        }
    }

    private static String getString(LocalDateTime dateTime, int inputed_Number, DateTimeFormatter formatter) {
        LocalDateTime calculatedFutureTime = dateTime.plusMinutes(inputed_Number);
        String newFormattedCalculatedTime = calculatedFutureTime.format(formatter);
        return newFormattedCalculatedTime;
    }

}
