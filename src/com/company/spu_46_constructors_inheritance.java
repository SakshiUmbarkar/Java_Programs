package com.company;

class base1{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    base1(){
        System.out.println("I am a constructor");
    }


}
class derived1 extends base1{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    derived1(){
        System.out.println("I am base class");
    }
}

public class spu_46_constructors_inheritance {
    public static void main(String[] args) {

        base1 b1 = new base1();


    }
}
