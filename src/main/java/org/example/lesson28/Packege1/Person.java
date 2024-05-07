package org.example.lesson28.Packege1;

import org.example.lesson28.Test;

public class Person {
    protected String name;

    public Person(){
        this.name = "Bob";
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
