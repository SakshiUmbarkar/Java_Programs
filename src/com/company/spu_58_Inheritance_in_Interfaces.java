package com.company;

interface Sampleinterface{
    void Meth1();
    void Meth2 ();
}
interface childSampleinterface extends Sampleinterface{
    void Meth3();
    void Meth4();
}
class MySampleclass implements childSampleinterface{
    public void Meth3(){
        System.out.println("meth3");
    }
    public void Meth4(){
        System.out.println("meth4");
    }
    public void Meth1(){
        System.out.println("meth1");
    }
    public void Meth2(){
        System.out.println("meth2");
    }

}
public class spu_58_Inheritance_in_Interfaces {
    public static void main(String[] args) {

    }
}
