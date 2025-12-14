package Liam;

public class Integers_mathOperations {
    public static void botaFlakao(String[] args) {

        /*   INTRODUCING MATHEMATICAL OPERATIONS   */

        int n1 = 100;
        int n2 = 200;

        // SUM of these numbers
        int sum = n1 + n2;
        System.out.println("The sum of " + n1 + "and " + n2 + "is " + sum);

        // SUBTRACTION of these numbers
        int sub = n1 - n2;
        System.out.println("The subtraction of " + n1 + "and " + n2 + "is " + sub);

        // Multiplication
        int multiplication = n1 * n2;
        System.out.println("The multiplication of " + n1 + "and " + n2 + "is " + multiplication);

        // division
        // ** detail: in this case, the division of 100/200 would be 0.5, however we are dividing 2 integers, so**
        int division = n1 / n2;
        System.out.println("The division of " + n1 + "and " + n2 + "is " + division);

        int division2 = n2 / n1;
        System.out.println("The division of " + n1 + "and " + n2 + "is " + division2);

        /*
        * REMAINDERS OR (MODULO)
        */
        int remainder = 100 % 2;
        System.out.println("Remaining from 100/2: " + remainder);

        /* MATH METHODS! */
        System.out.println("Absolute value: " + Math.abs(-100));

        System.out.println("Ceiling value: " + Math.ceil(1.23));
        // mathematical concept of rounding a number up to the nearest integer or a specified multiple
        System.out.println("Rounded value: " + Math.round(1.23));
        System.out.println("Floored value: " + Math.floor(1.23));
        // rounds any number down to the nearest whole integer

        System.out.println("Maximum: " + Math.min(10, 200));
        System.out.println("Maximum: " + Math.max(37, 750));

    }
}
