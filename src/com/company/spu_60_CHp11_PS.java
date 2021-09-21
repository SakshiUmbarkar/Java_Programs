package com.company;
// Problem 1 and Provlem 2
abstract class pen{
    abstract void write();
    abstract void refill();
}
class fountainPen extends pen{
    void write() {
        System.out.println("Writing");
    }
    void refill() {
        System.out.println("Refiling ...");
    }
    void changeNip(){
        System.out.println("Chainging the nip");
    }
}
// problem 3

class Monkey{
    void jump(){
        System.out.println("Jumping...");
    }
    void bite(){
        System.out.println("Biting...");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}

class Human extends Monkey implements BasicAnimal{
    @Override
    public void eat() {
        System.out.println("Eating..");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping");
    }

    void speak(){
        System.out.println("Hello sir");
    }
}

public class spu_60_CHp11_PS {
    public static void main(String[] args) {
        fountainPen N = new fountainPen();
        N.changeNip();

        //problem 3
        Human Sakshi = new Human();
        Sakshi.sleep();
        // problem 5
        Monkey m1 = new Human();
        //m1.speak() --> speak() method Cannot be used because the refrence is monkey which cannot use speak method
    }
}
