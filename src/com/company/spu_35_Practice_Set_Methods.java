package com.company;

public class spu_35_Practice_Set_Methods {
    // problem 1
    static void multication(int n){
        for(int i = 1;i<= 10 ; i++){
            System.out.format("%d X %d = %d \n",n,i,n*i);
        }
    }
    // problem 2
    static void pattern1(int n){
        for(int i = 0 ; i<n ; i++){
            for(int j=0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
    static int sumRec(int n){
        // base condition
        if(n==1){
            return 1;
        }
        return n + sumRec(n-1);

    }
    public static void pattern(int n){
        for (int i=n;i>=0;i--){
            for (int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static int fib(int n){
        if (n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        }
        else{
            return fib(n-1)+ fib(n-2);
        }
    }
    // problem 8
    static void pattern1_rec(int n){
        if(n>0){
            pattern1_rec(n-1);
            for(int i = 0 ; i<n ; i++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    // patern1_rec(3)
    // patern1_rec(2) + 3 TIMES star and new line
    // patern1_rec(1) + 2 TIMES star and new line + 3 TIMES star and new line
    // patern1_rec(1) + 1 TIMES star and new line + 2 TIMES star and new line + 3 TIMES star and new line

    // problem 9
    static void Temperature(float c) {
        if (c ==0)
        {
            System.out.println("32 Faherenit ");
        }
        else {
            float f = (c * 9 / 5) + 32 ;
            System.out.println(f+" Faherenit");

        }
    }


    public static void main(String[] args) {
        // problem 1
        multication(9);

        // problem 2
        pattern1(6);

        // Problem 3
        int c = sumRec(3);
        System.out.println(c);

        // problem 4
        pattern(4);

        // problem 5
        int result = fib(5);
        System.out.println(result);

        // problem 8
        pattern1_rec(7);

        // problem 9
        Temperature(40);

        

    }
}
