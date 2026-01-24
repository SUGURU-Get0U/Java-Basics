package Liam.season2;

import java.sql.SQLData;

public class Casting_vars {
    static void main(String[] args) {
        // Casting is how do we change a variable type

        // for example
        int health = 10;
        float damage = 1.5f;

        //int result = health - damage;
        float resultFloat = health - damage; // implicit casting over here
        System.out.println("The result is " + resultFloat); // 8.5

        // when result is a float we do not lose any information, cause 10 - 1.5 is 8.5 and 8.5 is a float number
        // however when result is an int, we lose that .5 due to the data type
        // so we need to cast the value of DAMAGE to int

        int result = health - (int)damage; // like this, we're now casting!
        System.out.println("Int result: " + result); // 9

        // a more complex example
        result = (int)((float)health - damage);
        System.out.println("Int result: " + result); // 8

        String points = "100";

        int resultAdd = Integer.parseInt(points);
        System.out.println("Int result: " + resultAdd);
    }
}
