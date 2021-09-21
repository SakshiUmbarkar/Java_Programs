package com.company;

class MyNewthr1 extends Thread{

    public void run(){
        int i = 34;

        while (true){
            System.out.println("Thankyou " + getName());
          }
    }
}
class MyNewthr2 extends Thread{

    public void run(){
        int i = 34;

        while (true){
            System.out.println("Thankyou " + this.getName());
        }

    }
}

public class spu_75_Thread_Methods {
    public static void main(String[] args) {

        MyNewthr1 t1 = new MyNewthr1();
        MyNewthr2 t2 = new MyNewthr2();

        t1.start();
        try{
            t1.join();
        }
        catch (Exception e){
            System.out.println(e);
        }
        t2.start();



    }


}





