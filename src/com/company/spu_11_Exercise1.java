package com.company;
import java.util.Scanner;

public class spu_11_Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Physics marks : ");
        int Physics = sc.nextInt();
        System.out.println("Enter your English marks : ");
        int English = sc.nextInt();
        System.out.println("Enter your Chemistry marks :");
        int Chemsitry = sc.nextInt();
        System.out.println("Enter your java marks : ");
        int java = sc.nextInt();
        System.out.println("Enter your python marks :");
        int python = sc.nextInt();

        float percentage = ((Physics + English + Chemsitry + java + python)/500.0f)*100;
        System.out.println("Percentage is : ");
        System.out.println(percentage);

    }
}
