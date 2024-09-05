// Define the AnimalSound interface
interface AnimalSound {
    void makeSound();
}

// Implement the interface for Dog
class Dog implements AnimalSound {
    @Override
    public void makeSound() {
        System.out.println("Dog: Woof Woof!");
    }
}

// Implement the interface for Cat
class Cat implements AnimalSound {
    @Override
    public void makeSound() {
        System.out.println("Cat: Meow Meow!");
    }
}

// Implement the interface for Cow
class Cow implements AnimalSound {
    @Override
    public void makeSound() {
        System.out.println("Cow: Moo Moo!");
    }
}

public class AnimalSoundExample {
    public static void main(String[] args) {
        AnimalSound dog = new Dog();
        AnimalSound cat = new Cat();
        AnimalSound cow = new Cow();

        dog.makeSound();
        cat.makeSound();
        cow.makeSound();
    }
}
