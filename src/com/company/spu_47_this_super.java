package com.company;

class ekclass{
    int a;

    public int getA() {
        return a;
    }
    ekclass(int a){
        this.a = a;
    }
    public int returnnone(){
        return 1;
    }

}

class Doclass extends ekclass{

    Doclass(int c){
        super(c);
        System.out.println("I am a constructor");


    }
}



public class spu_47_this_super {
    public static void main(String[] args) {

        ekclass e = new ekclass(4);
        System.out.println(e.getA());

    }
}
