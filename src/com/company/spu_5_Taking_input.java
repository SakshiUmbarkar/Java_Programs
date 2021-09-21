package com.company;
import java.util.Scanner;

public class spu_5_Taking_input {
    public static void main(String[] args) {
        System.out.println("Taking input from user :");
        Scanner sc = new Scanner(System.in); //system.in means we want to take input from user.
        /*System.out.println("Enter no 1 :");
        int a = sc.nextInt(); // means jo bhi no input dega wo abhi a mein ayega.
        System.out.println("Enter no 2 :");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum of the numbers is :");
        System.out.println(sum);

         */
        boolean b1 = sc.hasNextInt();
        System.out.println(b1);
    }
}
