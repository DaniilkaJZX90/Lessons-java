package org.example.lesson38;

import java.io.IOException;
import java.util.Scanner;

public class Exception2 {
    public static void main(String[] args) throws IOException{
        Scanner scaner = new Scanner(System.in);
        while (true){
            int n = Integer.parseInt(scaner.nextLine());

            if(n != 0) {
                try{
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("Вы ввели не ноль");
                }
                break;
            }
        }
    }
}
