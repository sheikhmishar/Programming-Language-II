package labsubmit;

import java.util.*;

class Animal {

    //Name of the Animal
    private String sound = "Animal Sound";

    //Default Constructor
    public Animal() {
    }

    //Overloaded Constructor
    Animal(String _sound) {
        this.sound = _sound;
    }

    //Return sound
    public String makeSound() {
        return sound;
    }
}

class Dog extends Animal{

    public Dog(String s) {
        super(s);
    }
    
}
class Cat extends Animal{
    public Cat(String s) {
        super(s);
    }
}
public class LabSubmit {

    public static void printSound(Animal a) {
        System.out.println(a.makeSound());
    }

    public static void main(String[] args) {
        Dog d1 = new Dog("bark");
        Cat c1 = new Cat("meow");
        Animal a1 = new Animal("Animal do not make sound");
        printSound(a1);
        printSound(c1);
        printSound(d1);
    }

}
