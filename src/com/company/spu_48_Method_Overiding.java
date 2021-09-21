package com.company;

class A{
    public int sahil(){
        return 4;
    }
    public void meth2(){
        System.out.println("I am method 2 in class A");
    }

}
class B extends A{

    @Override
    public void meth2(){
        System.out.println("I am method 2 in class B");
    }
    public void meth3(){
        System.out.println("I am method 3 in class B");
    }
}

public class spu_48_Method_Overiding {
    public static void main(String[] args) {

        A a = new A();
        a.meth2();

        B b = new B();
        b.meth2();
    }
}
