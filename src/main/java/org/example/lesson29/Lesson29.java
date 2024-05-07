package org.example.lesson29;

public class Lesson29 {
    //Полиморфизм - способность метода обрабатывать данные разных типов
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        animal.eat();
        dog.eat();

        Animal dog1 = new Dog();
        Dog dog2 = new Dog();
        dog.eat();

        Cat cat = new Cat();

        test(cat);
        test(dog);


    }

    public static void test(Animal animal){
        animal.eat();
    }
}
