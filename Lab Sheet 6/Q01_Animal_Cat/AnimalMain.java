class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark Bark!");
    }
}

public class AnimalMain {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.makeSound();
    }
}
