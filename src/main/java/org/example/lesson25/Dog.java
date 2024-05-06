package org.example.lesson25;

public class Dog extends Animal{

    public Dog(String name){
        super.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }

    public void bark(){
        System.out.println("I am barking");
    }

    public void showName(){
        System.out.println(name);
    }
}
