package org.example.lesson32;

public class Dog extends Animal{
    public void bark(){
        System.out.println("Dog is barking");
    };

    @Override
    public void eat() {
        super.eat();
    }
}
