package com.company;

public class spu_80_try_Catch {
    public static void main(String[] args) {
        int a = 1000;
        int b =0;
        // without try it will show execption

        // with try
        try{
            int c = a/b;
            System.out.println("Result is "+ c);
        }
        catch (Exception e){
            System.out.println("We failed to divide .Reason");
            System.out.println(e);
        }
        System.out.println("End of the program");
    }
}
