package com.company;

public class spu_9_Operator_Precidense {
    public static void main(String[] args) {
        int a =  6*5 - 34/2 ;
        //    =  30 - 34/2
        //    =  30 - 17
        //    =   13
        int b =  60/5 - 34*2;
        //    =  12 - 34*2
        //    =  12 - 68
        //    =  -56
        System.out.println(a);
        System.out.println(b);
        // Precedence and Associativity

        // Quick Quiz
        int x = 6;
        int y = 1;
        //int k = x * (y/2);

        int c = 4;
        int k = (b*b - 4*a*c)/(2*a); // "()" has the highest precedence.
        System.out.println(k);

        

    }
}
