package com.company;

class cylinder{
    private int radius;
    private int height;

    // problem 3
    public cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double surfacearea(){
       return 2 * 3.142 * radius * radius + 2 * radius * height;
    }
    public double volume(){
        return 3.142 * radius * radius  * height;
    }
    class Rectangle{
        private int length;
        private int breadth;
    }
}
class Rectangle{
    private int length;
    private int breadth;

    public Rectangle() {
        this.length = 4;
        this.breadth = 5;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
}

public class spu_44_practiceSet_9 {
    public static void main(String[] args) {

        /* Problem 1
        cylinder myclinder = new cylinder();
        myclinder.setHeight(12);
        int h = myclinder.getHeight();
        System.out.println(h);
        myclinder.setRadius(5);
        int r = myclinder.getRadius();
        System.out.println(r);

        // problem 2
        System.out.println(myclinder.surfacearea());
        System.out.println(myclinder.volume());

         */

        Rectangle r = new Rectangle();
        System.out.println(r.getLength());








    }
}
