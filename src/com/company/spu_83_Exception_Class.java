package com.company;

import java.util.Scanner;

class MyExeptions extends Exception{
    public String tostring(){
        return "I am tostring()";
    }
    public String getmessage(){
        return "I am a getmessage()";
    }
}

public class spu_83_Exception_Class {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if(a<9){
            try{
                throw new MyExeptions();
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
                System.out.println(e);
            }
        }

    }
}
