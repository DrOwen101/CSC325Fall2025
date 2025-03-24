package jasonowenanimal;

public class Lizard extends Animal {

    // Constructor
    public Lizard(String name) {
        super(name); // Call the superclass constructor
    }

    // Implement the abstract method to specify the sound of the lizard
    @Override
    public String makeSound() {
        return "Croak";
    }

    // Implement the abstract method to specify how the lizard moves
    @Override
    public void move() {
        System.out.println("The lizard walks gracefully.");
    }

    // Implement the abstract method to specify how many legs the lizard moves on
    @Override
    public int numberOfLegs() {
        return 4;
    }
}