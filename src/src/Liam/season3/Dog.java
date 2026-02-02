package Liam.season3;

public class Dog extends Animal{

    public Dog(String image, String name, int age) {
        super(image, name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("ワン");
    }

    @Override
    public void move() {
        System.out.println("Chicken is jocking");
    }

    /// A class has a default constructor that looks like this:
    /// public Dog() {
    ///
    /// };
    /// this constructor exist whether is typed or not and can be modified like the example below


    // notice how the dog and cat class have similar parameters, that's why we create the Animal Super class
    // they will then inherit these parameters!





}
