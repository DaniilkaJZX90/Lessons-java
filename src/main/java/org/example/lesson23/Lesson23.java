package org.example.lesson23;

public class Lesson23 {
    public static void main(String[] args) {
        String x = "hello";
        x = x.toUpperCase(); //(формотирование строки в заглавные БУКВЫ)
        //System.out.println(x);

        String string1 = "Hello ";
        String string2 = "my ";
        String string3 = "friend";
        String stringAll = string1 + string2 + string3; //(конктенация! 2 лишних объекта! String не изменяемый класс)
        System.out.println(stringAll);

        //StringBuilder изменяемый класс
        StringBuilder sB = new StringBuilder("hey");
        System.out.println(sB.toString());
        sB.append(" my")
          .append(" Friend");
        System.out.println(sB.toString());

        // Форматрование строк
        System.out.printf("This is a string, %s", "NICE"); //%s вствить строку
        System.out.println();
        System.out.printf("This is a digital, %d", 6); //%d вставить цифру, %f вещественное число с плавующей точкой
        System.out.println();

        //Ширина числа/строки

        System.out.printf("This is a string, %10s \n", "з");

        System.out.printf("This is a digital, %10d \n", 100);

        System.out.printf("This is a digital, %.2f \n", 1.3688);



    }
}
