package com.company;

public class spu_31_Methods_in_java {
    static int logic(int x , int y){
        int z;
        if (x>y){
            z = x + y;
        }
        else {
            z = (x +y) * 5;
        }
        return z;

    }
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c ;
        // Method invocation using object creation
        //spu_31_Methods_in_java obj = new spu_31_Methods_in_java();
        //c = obj.logic(a,b);
        c = logic(a,b);

        int a1 = 7;
        int b1 = 3;
        int c1;
        c1 = logic(a1,b1);
        System.out.println(c);
        System.out.println(c1);
    }

}
