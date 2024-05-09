package org.example.lesson32;

public class Solution {
    //восходящее и нисходящее преобразование
    public static void main(String[] args) {
        // восходящее преобразование (Upcasting) - объект движется вверх по иерархии наследования (происходит не явно)
        Animal animal = new Dog(); // восходящее преобразование (Upcasting)

        // Нисходящее преобразование (Downcasting) - нужно указывать явно (не безопасно)
        Dog dog = (Dog) animal;

        Animal a = new Animal();
        Dog dog2 = (Dog) a;
        dog2.bark();

    }
}
