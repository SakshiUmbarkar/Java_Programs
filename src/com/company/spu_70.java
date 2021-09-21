package com.company;

class MyThread1 extends Thread{
    public void run(){
        int i =0;
        while (i<100){
            System.out.println("I an a running thred");
            System.out.println("I am happy");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    public void run(){
        int i =0;
        while (i<100){
            System.out.println("Thred2 is good");
            System.out.println("I am sad");
            i++;
        }
    }
}

public class spu_70 {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();

    }
}
