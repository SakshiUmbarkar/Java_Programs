package com.company;

public class spu_84_Throw_Throws {
    public static int divide(int a,int b)throws ArithmeticException{
        int result = a/b;
        return result;

    }
    public static void main(String[] args) {
        try {
            int c = divide(9, 0);
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println("Exeption");
        }

    }

}
