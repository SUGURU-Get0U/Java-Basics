package Liam.season3;

import javax.swing.plaf.PanelUI;

public class Java_classes {
    static void main() {

        Animal jeff = new Dog("jeff.png", "jeff", 9);
        Animal mittens = new Cat("mittens.png", "mittens", 6);
        Animal ivan = new Dog("ivan.png", "Ivan", 7);

        System.out.println(jeff.name + " is " + jeff.getAge());
        System.out.println(mittens.name + " is " + mittens.getAge());
        System.out.println(ivan.name + " is " + ivan.getAge());

        ivan.setAge(100);
        System.out.println(ivan.name + " is " + ivan.getAge());

        // INHERITANCE AND POLYMORPHISM

        //a method can take different forms due to its overwriting in subclasses
        System.out.println(mittens.name + " does");
        mittens.makeSound();

        // ABSTRACT CLASSES AND INTERFACES
        // note that with our class we can create an instance of type animal:
        /// Animal animal = new Animal("Example.png", "animal", 67);
        // however that doesnt make sense... the scope is too broad and we cant tell which animal it is
        // therefore we have to make it AN ABSTRACT CLASS!

        mittens.move();
        ivan.move();

        // Interfaces
        // Are very similar to Abstract classes but
        // while in Abstract classes the effect is targeted only to its subclasses and can only extend one single super class
        // a single class can implement multiple interfaces
        // They work similar to a promise!

        Animal einstein = new Birdo("albert.png", "einstein", 67);
        einstein.move();
        ((Birdo) einstein).fly();

    }
}
