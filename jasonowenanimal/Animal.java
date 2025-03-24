package jasonowenanimal;

public abstract class Animal {
    private String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Getter for the name
    public String getName() {
        return name;
    }

    // Abstract method to define the sound the animal makes
    public abstract String makeSound();

    // Abstract method to define how the animal moves
    public abstract void move();

    // Abstract method to define the number of legs the animal moves on
    public abstract int numberOfLegs();
}