package Liam.season3.projects.TriviaGame;

public class Question {
    private int id;
    private String question;
    private String answer;

    Question(int id, String newQuestion, String newAnswer){
        this.id = id;
        this.question = newQuestion;
        this.answer = newAnswer;
    }

    public int getId() {
        return id;
    }
    public String getAnswer() {
        return answer;
    }
    public String getQuestion() {
        return question;
    }


    void checkAnswer(String userInput) {
        System.out.println(userInput.contains(answer.toLowerCase()) ? "✅ You Got it!" : "❌ Wrong!");
        System.out.println("loading next question...");
        // better way of using the ternary operator
        // cant use sout because of the void behavior!
    }

}
