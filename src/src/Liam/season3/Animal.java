package Liam.season3;

public class Animal {
    // These are the class' fields
    public String image; // public is accessible and changeable from anywhere
    protected String name; // protected is accessible in sub-classes and classes on the same package
    private int age; // private in accessible only in the class itself
    // public static int numberOfDogs = 0; // a static variable is a var that has its value shared with all instances of the class

    public Animal(String image, String name, int age) {
        this.image = image;
        this.name = name;
        this.age = age;
    }
    // You can add methods to the class
    public void birthday() {
        age++; // adds 1 to age
    }

    ///  creating a getter or a setter to work with the private variable
    public int getAge(){
        return age;
    };

    // Setter
    public void setAge(int newAge) {
        this.age = newAge;
    };

    public void makeSound(){
        System.out.println("skibidi");
    }
}
