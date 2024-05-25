package org.example.lesson41.abstractClass;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        //Animal animal = new Animal();// концепция(не сущность) такие объекты нельзя создавать

        cat.makeSound();
        dog.makeSound();
        dog.eat();




    }
}
