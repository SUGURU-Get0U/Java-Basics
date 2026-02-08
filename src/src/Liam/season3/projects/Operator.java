package Liam.season3.projects;

import java.util.Arrays;

public class Operator implements Combatant {

    private String name;
    private String rarity;
    private int level;
    private int hp = 100;

    Operator(String name, String rarity, int level, int hp) {
        this.name = name;
        this.rarity = rarity;
        this.level = level;
        this.hp = hp;
    };

    public String getName(){return name; };

    public int setLevel(){
        return level++;
    };
    public void displayInfo() {
        System.out.println("name: " + name);
        System.out.println("rarity: " + rarity);
        System.out.println("level: " + level);
        System.out.println("Health: " + hp + "hp");
        System.out.println("=====================");
    }
    // Add this so the Defender can override it later!
    public void useSkill() {
        System.out.println(name + " uses a generic skill!");
    }

    @Override
    public void performDefense() {
        if (level >= 10) {
            System.out.println("Clear Defense");
        } else {
            System.out.println("You took 10 dmg... \n Health = " + (hp - 10) );
        }
    }
}
