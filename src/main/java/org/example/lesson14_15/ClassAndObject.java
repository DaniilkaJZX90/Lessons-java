package org.example.lesson14_15;

public class ClassAndObject {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Roma";
        person1.age = 32;

        Person person2 = new Person();
        person2.name = "Vladimir";
        person2.age = 34;

        person1.speak();
        person1.sayHello();
        person2.speak();

    }
}

class Person {
   //У класса могут быть:
     //поля
     //методы

    String name;
    int age;

    void speak(){
        for (int i = 0; i < 3; i++) {
            System.out.println("Меня зовут " + name + " и мне " + age + " года");
        }
        System.out.println();

    }
    void sayHello(){
        System.out.println("Привет");
        System.out.println();
    }

}
class Test2{

}

