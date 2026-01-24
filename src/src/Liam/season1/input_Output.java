package Liam.season1;

import java.util.Scanner; // library imported to read data inputed on the console, similar to scanf on C

public class input_Output {
    public static void main(String[] args) {

        /* INPUTS & OUTPUTS ON JAVA */
        /* OUTPUT */
        System.out.println("Skibidi skibidi hawk tuah hawk");

        /* INPUT */
        Scanner scanner = new Scanner(System.in); // This is what we need to write to create a Scanner for INPUT!

        int age = scanner.nextInt(); // This is going to read and save the next INT
        System.out.println("You are " + age + " Years Old!");

        // if we type anything that is not a number, we can create a scanner to capture that as well!
        String input = scanner.next(); // next because the default value is a STRING!,
        System.out.println("You just typed "+ input);

        // Although Very simple, scanner.next() only reads the next CHAR of the input
        // Therefore to read an entire Line of input we should use
        /* ==      scanner.nextLine()    ==*/

        /* However there is a very recurrent error when using this!
        *
        * sometimes, because of our code structure, the nextLine will be wasted on reading the age value so
        * to avoid that we add another scanner.nextLine on top of the one that we want so it doesn't break the code*/

    }
}
