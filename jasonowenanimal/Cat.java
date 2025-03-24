package jasonowenanimal;

public class Cat extends Animal {

    // Constructor
    public Cat(String name) {
        super(name); // Call the superclass constructor
    }

    // Implement the abstract method to specify the sound of the cat
    @Override
    public String makeSound() {
        return "Meow";
    }

    // Implement the abstract method to specify how the cat moves
    @Override
    public void move() {
        System.out.println("The cat walks gracefully.");
    }

    // Implement the abstract method to specify how many legs the cat moves on
    @Override
    public int numberOfLegs() {
        return 4;
    }
}