package org.example.lesson24;

public class Lesson24 {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(s);

        Human h1 = new Human("Bob", 27);
        System.out.println(h1);

    }
}
class Human{
    String name;
    int age;

    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name = " + name +
                ", age =" + age + " " +
                '}';
    }
}
