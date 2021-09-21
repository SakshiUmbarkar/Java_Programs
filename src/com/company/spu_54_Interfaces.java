package com.company;

interface Bicycle{
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface HornBicycle{
    public int x = 45;
    void blowHornk3g();
    void blowHornmhn();
}

class AvonCycle implements Bicycle,HornBicycle {
    void blowhorn(){
        System.out.println("pee po pee po");
    }
    public void applyBrake(int decrement){
        System.out.println("Apply Brake");
    }
    public void speedUp(int increment){
        System.out.println("Applying speedup");
    }
    public void blowHornk3g(){
        System.out.println("kabhi khushi kabhi gum pe pe pe");
    }
    public void blowHornmhn(){
        System.out.println("main ho na po po po");
    }
}

public class spu_54_Interfaces {
    public static void main(String[] args) {
        AvonCycle ac = new AvonCycle();
        ac.applyBrake(2);
        // you can create properties in Interface.
        System.out.println(ac.a);
        // you can not modify properties in Interface as they are final
        ac.blowHornk3g();

    }
}
