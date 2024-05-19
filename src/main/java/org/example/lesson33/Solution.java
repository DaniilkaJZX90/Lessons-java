package org.example.lesson33;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    //Параметризация - Generics
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("cat");
        animals.add("dog");
        animals.add("frog");
        //animals.add();

        //for (Object o : animals) {
        //    System.out.println(o);
        //}
        for (int i = 0; i < animals.size(); i++) {
            String s = animals.get(i);
            System.out.println(s);
        }
    }

}
