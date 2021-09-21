package com.company;

class Circle{
    public int radius;

    Circle(int r){
        System.out.println("I am a Radius");
        this.radius = r;
    }



    public double area(){
        return Math.PI*this.radius*this.radius;
    }

}
class Cylinder1 extends Circle{
    public int height;

    Cylinder1(int r , int h){
        super(r);
        System.out.println("I am a Cylinder Parameterized constructor");
        this.height=h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius * height;
    }
}

public class spu_52_chp10_PS {
    public static void main(String[] args) {
        // problem
        Cylinder1 cyc = new Cylinder1(12,4);


    }
}
