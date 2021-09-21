package com.company;

interface MyCamera{
    void takesnap();
    void recordvideo();

    private void greet(){
        System.out.println("Good Morning");
    }
    default void record4kvideo(){
        greet();
        System.out.println("Taking Snap and recording 4k video");
    }
}
interface Mywifi{
    String[] getnetworks();
    void connectiontonetwork (String network);
}
class Mycellphone{
    void Callnumber(int phonenumber){
        System.out.println("Calling" + phonenumber);
    }
    void Pickcall(){
        System.out.println("Connecting......" );
    }
}
class MySmartphone extends Mycellphone implements Mywifi, MyCamera {
    public void takesnap(){
        System.out.println("Taking snap");
    }
    public void recordvideo(){
        System.out.println("Taking Snap");
    }
    public String[] getnetworks() {
        System.out.println("Getting list of Networks");
        String[] networklist={"Sakshi","Sahil","Sumit"};
        return networklist;
    }

    @Override
    public void connectiontonetwork(String network) {
        System.out.println("Connecting ..." + network);

    }
}

public class spu_57_Default {
    public static void main(String[] args) {
        MySmartphone ms = new MySmartphone() ;
        String[] ar= ms.getnetworks();
        for (String item :ar ){
            System.out.println(item);
        }



    }
}
