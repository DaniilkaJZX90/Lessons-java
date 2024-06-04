package org.example.lesson45_46_47;

import java.io.Serializable;

public class Person implements Serializable {

    private static final long serialVersionUID = -3722203743604454371L;
    private int id;
    private String name;

    public Person(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return id + " " + name;
    }
}
