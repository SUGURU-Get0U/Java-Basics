package Liam.season3;

public class Cat extends Animal{

    public Cat(String image, String name, int age) {
        super(image, name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Nyan");
    }

    @Override
    public void move() {
        System.out.println("Cat is gooning");
    }
}
