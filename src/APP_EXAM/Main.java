package APP_EXAM;

// Parent class
class Animal
{
    // Method to be overridden
    public void makeSound()
    {
        System.out.println("The animal makes a sound");
    }
}

// Subclass Dog
class Dog extends Animal
{
    @Override
    public void makeSound()
    {
        System.out.println("The dog barks");
    }
}

// Subclass Cat
class Cat extends Animal
{
    @Override
    public void makeSound()
    {
        System.out.println("The cat meows");
    }
}

// Test class with main method
public class Main
{
    public static void main(String[] args)
    {
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.makeSound(); // The dog barks
        a2.makeSound(); // The cat meows
    }
}

