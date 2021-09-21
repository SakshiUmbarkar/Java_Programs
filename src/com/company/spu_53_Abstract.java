package com.company;

abstract class Parent2{
    public Parent2(){
        System.out.println("I am a constructor");
    }
    public void gm(){
        System.out.println("Good Morning");
    }
    abstract public void greet();
}
class Child extends Parent2{
    @Override
    public void greet() {
        System.out.println("Good morning");
    }
}

public class spu_53_Abstract {
    public static void main(String[] args) {

    }
}
