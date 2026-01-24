package Liam.season2;

import java.util.Scanner;

public class String_methods {
    static void main(String[] args) {
        // **String methods**

        String name = "liam";
        String waifu = "vivian";

        // Concatenation of Strings
        waifu ="queen " + waifu;
        System.out.println("hi my name is " + name + " and the goated waifu is "+ waifu);

        // Strings can be sentences
        String sentence = "at first I was afraid, I was petrified";
        System.out.println(sentence);

        // Upper case / Lower case
        System.out.println("Lower case: " + sentence.toLowerCase());
        System.out.println("Upper case: " + sentence.toUpperCase());

        // Contains?
        System.out.println("Are you a \"SURVIVOR\": " + sentence.contains("I"));

        // Replacing
        System.out.println(sentence.replace("at first I was afraid, I was petrified", "all hail queen vivian"));

        // CharAt position
        System.out.println(sentence.charAt(7));

        // note that the original sentence is not modified! these methods return a new sentence with the modifications made
        System.out.println(sentence);

        Scanner scanner = new Scanner(System.in);
        String test = scanner.next();

        System.out.println(test.equals("first"));
    }
}
