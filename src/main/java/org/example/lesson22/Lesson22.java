package org.example.lesson22;

public class Lesson22 {
    public static void main(String[] args) {
        final int X = 10;
        System.out.println(X);
        //X = 8; не возможно изменить константу

    }
}

class Test{
    public static final int CONSTANT = 90;
    public Test(){

    };

    public int getCONSTANT() {
        return CONSTANT;
    }
}
