package Liam.season3.projects.Calculator;

public class executions {
    protected void main(String[] args) {

        Calculator_Project calculo1 = new Calculator_Project(5,10, "+");
        // getResult() returns a double, so we need to capture and print it
        double finalResult = calculo1.getResult();

        System.out.println("The final result is: " + finalResult);
    }
}
