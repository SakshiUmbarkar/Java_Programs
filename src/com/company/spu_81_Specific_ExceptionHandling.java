package com.company;
import java.util.Scanner;

public class spu_81_Specific_ExceptionHandling {
    public static void main(String[] args) {
        int[]marks = new int[5];
        marks[0] = 30;
        marks[1] = 40;
        marks[3] = 50;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Index");
        int ind = sc.nextInt();

        System.out.println("Enter the number you want to divide with");
        int number = sc.nextInt();
        try{
            System.out.println("The value at array index entered id " + marks[ind]);
            System.out.println("The value of array - value/number is :" + marks[ind]/number);
        }
        catch (Exception e){
            System.out.println("Some exeption occured");
            System.out.println(e);
        }

    }
}
