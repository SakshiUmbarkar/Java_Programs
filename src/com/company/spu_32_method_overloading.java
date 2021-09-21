package com.company;

public class spu_32_method_overloading {
    static void foo(){
        System.out.println(" Good morning bro!");
    }
    static void foo(int a){
        System.out.println(" Good morning "+ a + " bro !");
    }
    static void foo(int a, int b){
        System.out.println(" Good morning "+ a + " bro !");
        System.out.println(" Good morning "+ b + " bro !");
    }
    static void change (int a){
        a = 98;
    }
    static void change2 (int [] arr){
        arr[0]= 98;
    }
    static void telljoke(){
        System.out.println("I invented a new word!\n "+ " Playgarism!");
    }
    public static void main(String[] args) {
        //telljoke();

        // case 1: Changing the Integer
        // int x = 45;
        // change(x);
        // System.out.println("The value of x after change is : " + x);

        // Case 1 : Changing the array
        //int [] marks = {23,44,78,56,90,};
        //change2(marks);
        //System.out.println("The value of x after change is : " + marks[0]);




        // Method Overloading
        foo();
        foo(3000);
        foo(3000,4000);// Arguments are actual (means arguments are actual value)


    }
}
