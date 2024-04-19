// Interface with a variable
interface Animal {
    String sound = "Animal Sound";
    void makeSound();
}

// Implementing class
class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
        System.out.println("Sound: " + dog.sound); // Accessing variable from interface
    }
}