package org.example.lesson5;

import java.util.ArrayList;

public class ForLoop {
    public static void main(String[] args) {
        int n = 0;
        for (int i = 0; i < 10; i++) {
            n++;
            System.out.println("test " + n);

        }

        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = "test";
            list.add(s);
        }

        for (String s : list)
            System.out.println(s);
    }
}
