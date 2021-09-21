package com.company;
import java.util.Scanner;

public class spu_79_ErrorsDemo {
    public static void main(String[] args) {
        // LOGICAL ERROR DEMO
        // Write a program to write prime numbers between 1 to 10
        System.out.println(2);
        for(int i = 1; i<5 ;i++){
            System.out.println(2*i +1);
            // It is logical error as we have written program of giving odd numbers

        }

        // RUN TIME ERROR

        int k ;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        System.out.println("Integer part 1000 divided by k is " + 1000/k);
        //if divided by 0 shows aruntime error.


    }
}
