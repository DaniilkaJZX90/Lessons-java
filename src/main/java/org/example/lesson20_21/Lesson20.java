package org.example.lesson20_21;

public class Lesson20 {
    public static void main(String[] args) {
        Human human1 = new Human("Horton", 7);
        Human human2 = new Human(7);
        Human human3 = new Human("Pedro" );
        Human h4 = new Human();
        Human.description = "Nice";
        human1.getAllFields();
        human2.getAllFields();

        Human.getCountPeople();



        //System.out.println(Math.pow(2,4));
    }
}
class Human {
    private String name; // переменная пренадлежит только объекту класса
    private int age;
    public static String description;
    private static int countPeople;// переменнвя пренадлежит классу и объекту класса



    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        countPeople++;
    }

    public Human(String name) {
        this.name = name;
        countPeople++;
    }

    public Human(int age) {
        this.age = age;
        countPeople++;
    }

    public Human(){
        this("Bob", 7);
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public static void getDescription() {
        System.out.println(description);
    }
    public void getAllFields(){
        System.out.println(name + ", " + age + ", " + description);
    }

    public static void getCountPeople(){
        System.out.println("колличество сотрудников " + countPeople);
    }
}


