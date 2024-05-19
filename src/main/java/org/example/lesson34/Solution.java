package org.example.lesson34;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Animal(1));
        animalList.add(new Animal(2));

        List<Dog> dogList = new ArrayList<>();
        dogList.add(new Dog(3));
        dogList.add(new Dog(4));

        showListAnimal(animalList);
        showListAnimal(dogList);
    }
    private static void showListAnimal(List<? extends Animal> animals){
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}
