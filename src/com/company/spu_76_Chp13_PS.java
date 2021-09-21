package com.company;

class Practice13 extends Thread{
    public void run(){
        while (true){
            System.out.println("Good Morning");
        }
    }
}
class Practice13B extends Thread{
    public void run(){
        while (true){
            // problem 2
            try{
                Thread.sleep(200);
            }
            catch (Exception e){
                System.out.println(e);
            }
            System.out.println("Welcome");
        }
    }
}

public class spu_76_Chp13_PS {
    public static void main(String[] args) {

        //Problem1
        Practice13 ps = new Practice13();
        ps.run();
        Practice13B Ps = new Practice13B();
        Ps.run();
//        ps.setPriority(6);
//        Ps.setPriority(9);
        System.out.println(ps.getPriority());
        System.out.println(Ps.getPriority());
        System.out.println(Thread.currentThread().getState());

    }
}
