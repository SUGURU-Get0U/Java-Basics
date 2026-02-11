package Liam.season3.projects.TriviaGame;

import javax.swing.*;
import java.util.Scanner;

public class Main {
     void main(String[] args) {
         String gameStatus;
        Question q1 = new Question(1, "Who is the goat ZZZ waifu?  ", "Vivian Banshee");
        Question q2 = new Question(2, "Who is Phaeton's most loyal Fan? ", "Vivian Banshee");
        Question q3 = new Question(3, "Who won 5 noble prizes in a roll? ", "Vivian Banshee");
        Question q4 = new Question(4, "Who is able to slime Miyabi and Yi xuan? ", "Vivian Banshee");
        Question q5 = new Question(5, "What is the best Alien stage song? ", "Cure");
        Question q6 = new Question(6, "Is Luka gay? ", "yes");
        Question q7 = new Question(7, "What's the best rank in RL : ", "super mcDonald's legend");
        Question q8 = new Question(8, "Who is the goat ZZZ waifu? : ", "Vivian Banshee");
        Question q9 = new Question(9, "Who is the goat ZZZ waifu? : ", "Vivian Banshee");
        Question q10 = new Question(10, "Who is the goat ZZZ waifu? : ", "Vivian Banshee");

        /// start the trivia
         Scanner scanner = new Scanner(System.in);
         System.out.println("Do you wish to start the trivia game? [y/n]");
         gameStatus = scanner.next();

         if (gameStatus.equals("y") || gameStatus.equals("Y")) {
             for (int q = 0; q > 10; q++) {
                 String userAnswer;
                 Scanner getsAnswer = new Scanner(System.in);
                 System.out.println(q1.getQuestion());

                 userAnswer = getsAnswer.nextLine();
                 q1.checkAnswer(userAnswer);
             }

         }

    }
}
