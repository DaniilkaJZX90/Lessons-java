package org.example.lesson35;

/*public class Animal {
    public void eat(){
        System.out.println("Animal is eating");
    }
}
/* class OtherAnimal extends Animal{
    @Override
    public void eat() {
        System.out.println("Other animal is eating");
    }
}*/

interface Animal{
    public void eat();
}
class Test{
    public static void main(String[] args) {


        Animal animal2 = new Animal(){
            public void eat(){
                System.out.println("Other Aanimal is eating");
            }
        };

        animal2.eat();


       /* OtherAnimal otherAnimal = new OtherAnimal();
        otherAnimal.eat();*/
    }
}
