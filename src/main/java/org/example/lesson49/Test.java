package org.example.lesson49;

public class Test {
    public static void main(String[] args) {
        //counter(3);

        //4! = 4 * 3 * 2 * 1
        //1! = 1
        //15! = 15 * 14 * 13 * ... *
    }

    public static void counter(int n) {
        if (n == -1)
            return;

        System.out.println(n);


        counter(n - 1);

    }

    public static int fac(int n){
        if(n==1) {
            return 1;
        }
        return n * fac(n - 1);

    }
}
