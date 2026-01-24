package Liam.season2;

public class ternary_op {
    static void main(String[] args) {
        // The Ternary operator is a way of simplifying IF statements to make the code better to read and comprehend.
        // it is useful to declutter the code

        int health = -1;
        String status = "";
        System.out.println("Your health is " + health);
        System.out.println("Status: "+ status);

        if (health > 0) {
            status = "alive";
        } else {
            status = "dead";
        }
        System.out.println("Status: " + status);

        // now using the Ternary operator we can make this shorter
        status = health > 0 ? "alive" : "dead";
        System.out.println("Status: " + status);
    }
}
