package com.company;

import java.util.Scanner;

public class spu_86_CHp14_PS {
    public static void main(String[] args) {
        // problem 1
        // Syntax Error = int a = 5
        int age = 19;
        int Year_born = 2000 - 19; // Logical error
        System.out.println(6/0); // runtime error

        // problem 2

        try{
            int a = 666/9;
        }
        catch (IllegalArgumentException e){
            System.out.println("Hehe");
        }
        catch (ArithmeticException e){
            System.out.println("haha");
        }

        // problem 3
        int[]marks = new int[5];
        marks[0] = 30;
        marks[1] = 40;
        marks[3] = 50;


        Scanner sc = new Scanner(System.in);
        int index;
        int i =0;

        boolean flag = true;
        while (flag && i<5){
            try {
                System.out.println("Enter the invalid index");
                index = sc.nextInt();
                System.out.println("The value of marks[index] is : " + marks[index]);
            }
            catch (Exception e){
                System.out.println("Invalid index");
                i++;
            }
            if(i>5){
                System.out.println("Error");
            }

        }
    }
}

