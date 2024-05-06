package org.example.Interfaces_26;

public class Animal implements Info{
    public int id;

    public Animal(int id){
        this.id = id;
    }

    public void sleep(){
        System.out.println("animal № " + id + " is sleeping");
    }

    @Override
    public void showInfo() {
        System.out.println("id Animal - " + id);
    }
}
