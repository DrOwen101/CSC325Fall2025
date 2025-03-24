package jasonowenanimal;

public class Dog extends Animal {

    // Constructor
    public Dog(String name) {
        super(name); // Call the superclass constructor
    }

    // Implement the abstract method to specify the sound of the dog
    @Override
    public String makeSound() {
        return "Bark";
    }

    // Implement the abstract method to specify how the dog moves
    @Override
    public void move() {
        System.out.println("The dog runs swiftly.");
    }

    // Implement the abstract method to specify how many legs the dog moves on
    @Override
    public int numberOfLegs() {
        return 4;
    }
}