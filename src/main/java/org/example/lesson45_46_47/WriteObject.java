package org.example.lesson45_46_47;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {

        Person[] people = new Person[3];
        people[0] = new Person(1, "Oleg");
        people[1] = new Person(2, "Philip");
        people[2] = new Person(3, "Piter");

        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            //oos.writeInt(people.length);

            //for (Person person : people) {
            //    oos.writeObject(person);
            //}
            oos.writeObject(people);


            oos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
