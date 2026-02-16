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



    public boolean checkAnswer(String userInput) {
        // Standardizing both to lowercase makes it case-insensitive!
        if (userInput.toLowerCase().trim().equals(answer.toLowerCase())) {
            System.out.println("✅ You Got it!");
            return true;
        } else {
            System.out.println("❌ Wrong! The answer was: " + answer);
            return false;
        }
    }

}
