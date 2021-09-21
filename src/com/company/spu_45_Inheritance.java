package com.company;

class base{
     int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void printme(){
        System.out.println(" I am in base and setting x");
    }
}
class derived extends base{

    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void printme(){
        System.out.println(" I am a constructor");
    }
}
class Animal{
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void Dog(){
        System.out.println("I am a dog from base class");
    }
}
class Omnivorous extends Animal{

    public void cat(){
        System.out.println("I am a cat");
    }
}

public class spu_45_Inheritance {
    public static void main(String[] args) {

        base b = new base();

        b.setX(8);
        System.out.println(b.getX());

        Animal a = new Animal();


        System.out.println(a.getName());

    }
}
