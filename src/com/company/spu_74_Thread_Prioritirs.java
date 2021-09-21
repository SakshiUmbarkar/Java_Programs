package com.company;

class Mythr1 extends Thread{
    public Mythr1 (String name){
        super(name);
    }
    public void run(){
        int i = 34;
        System.out.println("Thankyou " + getName());
//        while (true){
//            System.out.println("Thankyou " + getName());
//        }
//            System.out.println("I am a Thread");
//        }
    }
}
class Mythr2 extends Thread{
    public Mythr2 (String name){
        super(name);
    }
    public void run(){
        int i = 34;
        //System.out.println("Thankyou " + this.getName());
          while (true){
              System.out.println("Thankyou " + this.getName());
          }
//            System.out.println("I am a Thread");
//        }
    }
}

public class spu_74_Thread_Prioritirs {
    public static void main(String[] args) {
        Mythr1 t1 = new Mythr1("Sakshi1");
        Mythr1 t2 = new Mythr1("Sakshi2");
        Mythr1 t3 = new Mythr1("Sakshi3");
        Mythr1 t4 = new Mythr1("Sakshi4");
        Mythr2 t5 = new Mythr2("Sahil I LOVE YOU ");

        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
