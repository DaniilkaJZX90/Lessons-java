package org.example.Interfaces_26;

public class Person implements Info{
    String name;

    public Person(String name){
        this.name = name;
    }

    public void sayHello(){
        System.out.println(name + " say: hello");
    }

    @Override
    public void showInfo() {
        System.out.println("name Person - " + name);
    }
}
