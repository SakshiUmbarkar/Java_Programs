package com.company;

class Phone{
    public void name(){
        System.out.println("i am Java");
    }
    public void greet(){
        System.out.println("Good morning sahil");
    }
}
class Smartphone extends Phone{
    public void swagat(){
        System.out.println("Apka swagat hai");
    }
    public void name(){
        System.out.println("i am Java in class two");
    }

}
public class spu_49_Dyanamic_Method_Dispatch {
    public static void main(String[] args) {

        //Phone obj = new Phone();

        Phone obj = new Smartphone();
        //Smartphone obj2 = new Phone(); this is Not Allowed

        obj.greet();
        obj.name();

    }
}
