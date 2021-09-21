package com.company;

class Employee{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println(" and my name is " + name);

    }
    public int getsalary(){
        return salary;
    }
}

public class spu_38_Custom_class { // only one public class can be used.
    public static void main(String[] args) {
        System.out.println("This is our custom class"); // Instantiating a new Employee object
        Employee Sakshi = new Employee();

        // Setting attributes or properties

        Sakshi.id = 44;
        Sakshi.name = "Code with Sakshi";
        Sakshi.salary = 50;

        // printing the attributes

        Sakshi.printDetails();
        int salary = Sakshi.getsalary();
        System.out.println(salary);

        //System.out.println(Sakshi.id);
        //System.out.println(Sakshi.name);
    }
}
