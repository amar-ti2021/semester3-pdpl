class Animal {
    void eat() {
        System.out.println("eating...");
    }
}

class Dog extends Animal {
    void eat() {
        System.out.println("eating bread...");
    }
}

class Cat extends Animal {
    void eat() {
        System.out.println("eating wiskas...");
    }
}

class Lion extends Animal {
    void eat() {
        System.out.println("eating meat...");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Animal animal;
        animal = new Dog();
        animal.eat();

        animal = new Cat();
        animal.eat();

        animal = new Lion();
        animal.eat();
    }
}
