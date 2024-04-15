package org.example.lesson6;

public class If {

    public static void main(String[] args) {
        int myInt = 0;
        if(myInt<20) {
            System.out.println("Да, верно!");
        } else if(myInt>20) {
            System.out.println("Нет, не верно!");
        } else {
            System.out.println("Ни один из предыдущих вариантов!");
        }
    }
}
