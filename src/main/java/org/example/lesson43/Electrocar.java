package org.example.lesson43;

import static org.example.lesson29.Lesson29.test;

public class Electrocar{
    private int id;

    // нестатический вложенный класс (относятся к объекту)
    private class Motor{
        public void startMotor(){
            System.out.println("Motor " + id + " is starting..");
        }
    }

    // статический вложенный класс (не относится к объекту в котором он создан, но есть доступ к статическим полям над-класса)
    public static class Battery{
        public void charge(){
            System.out.println("Battery is charging..");
        }
    }

    public Electrocar(int id){
        this.id = id;
    }

    public void start(){
        Motor motor = new Motor();
        motor.startMotor();
        final int x = 1;
        //Класс внутри методов
        class SomeClass{
            public void someMethod(){
                System.out.println(x);
                System.out.println(id);
            }
        }
        SomeClass someObject = new SomeClass();
        test(someObject);

        System.out.println("Electrocar " + id + " is starting..");
    }

    private void test (Object o){

    }
}
