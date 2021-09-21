package com.company;

class MyEmployee{
    private int id;
    private String name;

//    public MyEmployee(){
//        id = 50;
//        name = "Sahu";
//    }

    public MyEmployee(String myname ,int myId){
        id = myId;
        name = myname;
    }
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

public class spu_42_Constructors {
    public static void main(String[] args) {

        MyEmployee Sakshi = new MyEmployee("Code with dollu",45);
//        Sakshi.setname("code with Sakshi");
//        System.out.println(Sakshi.getName());

        System.out.println(Sakshi.getId());
        System.out.println(Sakshi.getName());




    }
}
