package Liam.season3.projects;

import java.util.Arrays;

public class Operator {
    private String name;
    private String picture;
    private int rarity;
    private double[] stats;

    public Operator(String name, String picture, int rarity, double[] stats){
        this.name = name;
        this.picture = picture;
        this.rarity = rarity;
        this.stats = stats;
    }

    public void displayInfo(){
        System.out.println("名前：");
        getName();
        System.out.println("レア度（ど）：　");
        getRarity();
        System.out.println("ステータス：");
        getStats();
        System.out.println("画像（がぞう）：　");
        getPicture();

    }


    /// GETTERS FOR MY PRIVATE VARIABLES
    public void getName() {
        System.out.println(name);
    };

    public void getPicture() {
        System.out.println(picture);
    };

    public void getStats() {
        // This turns the double[] into a readable String like [20.0, 20.0...]
        System.out.println(Arrays.toString(stats));
    }

    public void getRarity() {
        System.out.println(rarity);
    };

    /// SETTERS FOR THE PRIVATE VARIABLES
    public void setName(String newName){
        this.name = newName;
    }

    public void setImage(String newPic){
        this.picture = newPic;
    }
    public void setRarity(int newRarity){
        this.rarity = newRarity;
    }

    public void setStats(double[] newStats){
        this.stats = newStats;
    }
    // Add this so the Defender can override it later!
    public void useSkill() {
        System.out.println(name + " uses a generic skill!");
    }
}
