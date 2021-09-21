package com.company;

public class spu_85_Finally_Block {

    public static int greet(){
        try{
            int a = 4;
            int b = 5;
            int c =a/b;
            return c;
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Cleaning the resources.....end of the program.");
        }
        return 0;
    }
    public static void main(String[] args) {

        int k = greet();
        System.out.println(k);

    }
}
