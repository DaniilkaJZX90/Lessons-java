package org.example.lesson14_15_16_17_18;

public class ClassAndObject {
    public static void main(String[] args) {
        Person person1 = new Person();

        person1.setName("Romario");

        Person person2 = new Person();

        person2.setAgeAndName(67, "Bob");

        person1.speak();
        person1.sayHello();
        person2.speak();

        int year1 = person2.calculateYearsToRetirement();
        System.out.println(year1);

    }
}

class Person {
   //У класса могут быть:
     //поля
     //методы

    private String name;
    private int age;



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

    int calculateYearsToRetirement(){
        int years = 70 - age;
        return years;
    }

    public void setAgeAndName(int age, String name) {
        this.age = age;
        this.name = name;

        }

    public void setName(String name){
        if (name.isEmpty()){ //проверка на отсутствие значения
            System.out.println("Вы не ввели имя!");
        } else {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age < 0){
            System.out.println("Вы ввели отрецательное значение!");
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }
}
class Test2{

}

