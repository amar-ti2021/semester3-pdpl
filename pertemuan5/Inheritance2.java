public class Inheritance2 {
    public static void main(String[]args){
        Cat cat = new Cat();
        cat.meow();
    }
}

class Animal {
    void eat(){ System.out.println("eating..."); }
}
class Dog extends Animal {
    void bark(){ System.out.println("barking..."); }
}
class BabyDog {
    void weep(){ System.out.println("weeping..."); }
}
class Cat extends Dog {
    void meow(){ System.out.println("meowing..."); }
}
