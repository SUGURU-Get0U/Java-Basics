package Liam.season3.projects.TriviaGame;

import java.util.*;

public class Game {
    public static int QuestionsInPool;
    public Question[] questionPool;
    public int score = 0;
    Random random = new Random();

    Game(Question[] questionPool ) {
       this.questionPool = questionPool;
    };

    void StartGame() {
        Scanner scanner = new Scanner(System.in);

        // 1. Convert array to a List so we can shuffle it easily
        List<Question> shuffledList = Arrays.asList(questionPool);
        Collections.shuffle(shuffledList);

        // 2. Decide how many questions to ask (e.g., 5)
        int questionsToAsk = 5;

        for (int i = 0; i < questionsToAsk; i++) {
            Question currentQ = shuffledList.get(i);

            // 3. Display Question
            System.out.println("\nQuestion " + (i + 1) + ": " + currentQ.getQuestion());

            // 4. Get User Input
            System.out.print("Your Answer: ");
            String userAnswer = scanner.nextLine();

            // 5. Use your existing checkAnswer logic
            // Note: I modified Question class slightly below to make this smoother
            currentQ.checkAnswer(userAnswer);
        }

        System.out.println("\nGame Over! Thanks for playing.");
    }
}

