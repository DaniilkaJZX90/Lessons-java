package org.example.lesson37;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) {

        try {
            readFile();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static void readFile() throws FileNotFoundException{
        File file = new File("C:\\Users\\danii\\IdeaProjects\\AT\\src\\test1.txt");
        Scanner scanner = new Scanner(file);
    }
}
