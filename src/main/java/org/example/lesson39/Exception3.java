package org.example.lesson39;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception3 {
    public static void main(String[] args) {
        //Checked Exception =  исключительные случаи в работе программы
        //Unchecked = ошибка в работе программы

        File file = new File("C:\\Users\\danii\\IdeaProjects\\AT\\src\\test1.txt");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        //int a = 1 / 0; //ArithmeticException
        //String name = null;
        //name.length(); //NullPointerException
        int[] n = new int[2];
        n[2] = 45; //ArrayIndexOutOfBoundsException

    }
}
