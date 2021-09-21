package com.company;

class Mythr extends Thread{
    public Mythr (String name){
        super(name);
    }
    public void run(){
        int i = 34;
        System.out.println("Thankyou");
//        while (true){
//            System.out.println("I am a Thread");
//        }
    }
}
public class spu_73_Thread_Constructors {
    public static void main(String[] args) {
       Mythr mt = new Mythr("Sakshi");
       mt.run();
        System.out.println("The id of the thread is :" + mt.getId());
        System.out.println("The name of thread is " + mt.getName());



    }
}
