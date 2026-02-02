package Liam.season3;

public class Birdo extends Animal implements IInterfaces_java {

    public Birdo(String image, String name, int age) {
        super(image, name, age);
    }

    @Override
    public void move() {
        fly();
    }

    @Override
    public void makeSound() {
        System.out.println("What is this diddy bird doing at the java code");
    }

    @Override
    public void fly() {
        System.out.println("I think this diddy bird is kirk");
    }
}
