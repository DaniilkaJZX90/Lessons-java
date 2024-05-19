package org.example.lesson36;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path = separator + "Users" + separator + "danii" + separator + "Desktop" + separator + "тест2.txt";
        File file = new File(path);

        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String [] numberStrings = line.split(" ");//разделитель, по какому то аргументу
        int[] numbers = new int[3];
        int counter = 0;

        for (String number : numberStrings) {
            numbers[counter] = Integer.parseInt(number);
        }
        /*while(scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }*/
        System.out.println(Arrays.toString(numbers));
        scanner.close();
    }
}
