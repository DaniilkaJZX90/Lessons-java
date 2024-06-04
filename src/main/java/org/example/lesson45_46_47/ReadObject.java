package org.example.lesson45_46_47;

import java.io.*;

public class ReadObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("people.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);

        /*int personCount = ois.readInt();
        Person[] people = new Person[personCount];

        for (int i = 0; i < personCount; i++) {
            people[i] = (Person) ois.readObject();
        }*/
        Person[] people = (Person[]) ois.readObject();

        ois.close();

        for (Person person : people) {
            System.out.println(person);
        }
    }
}
