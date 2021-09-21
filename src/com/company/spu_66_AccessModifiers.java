package com.company;

class C1{

    public int x =5;
    protected int y = 15;
    int i = 25;
    private int p = 35;

    public void meth1(){
        System.out.println(5);
        System.out.println(15);
        System.out.println(25);
        System.out.println(35);

    }
}

public class spu_66_AccessModifiers {
    public static void main(String[] args) {

        C1 c = new C1();
        //c.meth1();
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.i);
        //System.out.println(c.p); private cannot be used in same package

    }
}
