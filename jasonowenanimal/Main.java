package jasonowenanimal;

public class Main {
    public static void main(String[] args) {
        // Create instances of Dog and Cat
        Animal dog = new Dog("Buddy");
        Animal cat = new Cat("Whiskers");

        // Test Dog
        System.out.println("The dog " + dog.getName() + " says: " + dog.makeSound());
        System.out.println("It moves on " + dog.numberOfLegs() + " legs.");
        dog.move();

        // Test Cat
        System.out.println("\nThe cat " + cat.getName() + " says: " + cat.makeSound());
        System.out.println("It moves on " + cat.numberOfLegs() + " legs.");
        cat.move();
    }
}