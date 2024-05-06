package org.example.Interfaces_26;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal(1);
        Person person1 = new Person("Oleg");
        animal1.sleep();
        person1.sayHello();
        animal1.showInfo();
        person1.showInfo();

        Info info1 = new Animal(2);
        Info info2 = new Person("Nigaz");

        info1.showInfo();
        info2.showInfo();

        outputInfo(animal1);
    }

    public static void outputInfo(Info info){
        info.showInfo();
    }
}
