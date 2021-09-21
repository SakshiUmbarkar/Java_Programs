package com.company;

class Employe{
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setname(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id = i;

    }
    public int getId(){
        return id;
    }

}

public class spu_40_chp9 {
    public static void main(String[] args) {
        Employe Sakshi = new Employe();
        Sakshi.setname("code with Sakshi");
        System.out.println(Sakshi.getName());


    }
}
