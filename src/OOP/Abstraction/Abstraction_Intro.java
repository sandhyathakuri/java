package OOP.Abstraction;

public class Abstraction_Intro {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        dog.move();
        dog.eatAndDrink();


        Horse horse = new Horse();
        horse.sound();
        horse.move();
        horse.eatAndDrink();

    }

}


abstract  class Animal {

    abstract void sound();

    abstract void move();

    abstract void eatAndDrink();
}
class Dog extends Animal{

    @Override
    void sound() {
        System.out.println("Dog sound");
    }

    @Override
    void move() {
System.out.println("Dog move");
    }

    @Override
    void eatAndDrink() {
System.out.println("Dog eatAndDrink");
    }
}
class Horse extends Animal{


    @Override
    void sound() {
        System.out.println("Horse sound");
    }

    @Override
    void move() {
        System.out.println("Horse move");

    }

    @Override
    void eatAndDrink() {
        System.out.println("Horse eatAndDrink");

    }
}