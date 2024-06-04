package org.example.lesson48;

public class Test {

    public static void main(String[] args) {
       /*Animal animal = Animal.DOG;

       switch (animal){
           case CAT:
               System.out.println("It's a cat");
               break;
           case DOG:
               System.out.println("It's a dog");
               break;
           case FROG:
               System.out.println("It's a frog");
               break;
       }

       Season season = Season.SUMMER;
        System.out.println(season.getTemperature());

        System.out.println(season.getClass());

        Animal animal = Animal.CAT;

        System.out.println(animal.getTranslation());
        System.out.println(animal);



       switch (season){
           case SUMMER:
               System.out.println("It's warm outside");
               break;
           case WINTER:
               System.out.println("It's cold outside");
               break;
       }*/

        Season season = Season.SUMMER;
        Animal animal = Animal.CAT;
        System.out.println(season.name());

        Animal cat = Animal.valueOf("CAT");
        System.out.println(cat);

        System.out.println(season.ordinal());




    }
}
