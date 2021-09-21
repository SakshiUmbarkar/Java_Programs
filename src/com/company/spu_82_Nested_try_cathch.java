package com.company;

import java.util.Scanner;

public class spu_82_Nested_try_cathch {
    public static void main(String[] args) {
        int[]marks = new int[5];
        marks[0] = 30;
        marks[1] = 40;
        marks[3] = 50;


        Scanner sc = new Scanner(System.in);
        int ind = sc.nextInt();

        try{
            System.out.println("Welcome to video no 82");
            try{
                System.out.println(marks[ind]);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Sorry this Index does not exist");
                System.out.println("Exeption in level 2");
            }
        }
        catch (Exception e){
            System.out.println("Exeption in level 1");
        }
    }
}
