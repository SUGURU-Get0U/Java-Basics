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



    }
}
