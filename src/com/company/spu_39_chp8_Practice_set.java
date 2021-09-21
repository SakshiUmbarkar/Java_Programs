package com.company;

class Employee1 {
    int Salary;
    String name;

    public int getSalary() {
        return Salary;
    }

    public String getName() {
        return name;
    }

    public void setname(String n) {
        name = n;

    }
}
class cellphone{
    public void ring(){
        System.out.println("ringing.....");
    }
    public void vibrate(){
        System.out.println("Vibrating.....");
    }
    public void callFriend(){
        System.out.println("Calling Sahil.....");
    }
}
class square{
    int side;
    public int area(){
        return side * side;
    }
    public int perimeter(){
        return  4 * side;
    }
}
class rectangle{
    int side1;
    int side2;
    public int area(){
        return side1 * side2;
    }
    public int perimeter(){
        return 2 * (side1 + side2);
    }
}
class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running from the enemy");
    }
    public void fire(){
        System.out.println("Firing on the enemy");
    }
}


public class spu_39_chp8_Practice_set {
    public static void main(String[] args) {
        /*
        //Problem 1
        Employee1 Sakshi = new Employee1();
        Sakshi.Salary = 500;
        Sakshi.setname("Code with Sakshi");
        System.out.println(Sakshi.getName());


        // problem 2
        cellphone iphone = new cellphone();
        iphone.callFriend();
        iphone.ring();
        iphone.vibrate();

          // problem 3
        square sq = new square();
        sq.side = 5;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());

        // problem 4

        rectangle rec = new rectangle();
        rec.side1 = 2;
        rec.side2 = 3;
        System.out.println(rec.area());
        System.out.println(rec.perimeter());

         */

        // problrm 5
        Tommy player1 = new Tommy();
        player1.run();
        player1.fire();
        player1.hit();





    }
}
