abstract class Animal {
    public abstract void eat();
    public abstract void sleep();
}

class Lion extends Animal {
    public void eat() { System.out.println("Lion eats meat"); }
    public void sleep() { System.out.println("Lion sleeps in its den"); }
}

class Tiger extends Animal {
    public void eat() { System.out.println("Tiger eats meat"); }
    public void sleep() { System.out.println("Tiger rests in a sheltered place"); }
}

class Deer extends Animal {
    public void eat() { System.out.println("Deer eats grass and leaves"); }
    public void sleep() { System.out.println("Deer sleeps in a safe resting place"); }
}

public class AnimalBehaviorMain {
    public static void main(String[] args) {
        Animal[] animals = { new Lion(), new Tiger(), new Deer() };
        for (Animal animal : animals) {
            animal.eat();
            animal.sleep();
        }
    }
}
