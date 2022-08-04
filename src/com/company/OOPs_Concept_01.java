package com.company;

class Employee{
    int id, exp, salary;
    String name, fname, mname, city, state, religion;

    public void printDetails()
    {
        System.out.println("My ID is : "+ id);
        System.out.println("My Name is : "+ name);
    }

    public void getSalary()
    {
        System.out.println("My Salary is : "+ salary);
    }

    public void personalDetails()
    {
        System.out.println("Fname: "+ fname);
        System.out.println("Mname: "+ mname);
        System.out.println("City: "+ city);
        System.out.println("State: "+ state);
        System.out.println("Religion: "+ religion);
        System.out.println("Experience: "+ exp);
    }
}

public class OOPs_Concept_01 {
    public static void main(String[] args) {
        System.out.println("Object Oriented Programing Concepts in Java");
        System.out.println("What is OOPs: "+"Solving a problem by creating objects");
        System.out.println("Creating Custom Class");

//        Instantiate a new Employee Object
        Employee aakash = new Employee();
        Employee john = new Employee();
        Employee vishal = new Employee();

//        Setting the Attribute
        aakash.id=56;
        aakash.name="Aakash Kumar";
        aakash.salary=500000;
        aakash.fname="Ranjit Kumar Keshri";
        aakash.mname="Ranjita Kumari";
        aakash.city="Chatra";
        aakash.state="Jharkhand";
        aakash.religion="Hinduism";
        aakash.exp=3;

        john.id=57;
        john.name="John Khandelwal";
        john.salary=400000;
        john.fname="Mukul Khandelwal";
        john.mname="Rita Khandelwal";
        john.city="Bikaner";
        john.state="Rajasthan";
        john.religion="Hinduism";
        john.exp=4;

        vishal.id=58;
        vishal.name="Vishal Jain";
        vishal.salary=450000;
        vishal.fname="Sarthak Jain";
        vishal.mname="Rishika Jain";
        vishal.city="Raipur";
        vishal.state="Chattisgarh";
        vishal.religion="Jainism";
        vishal.exp=4;

//        Printing the Attribute
//        System.out.println(aakash.id);
//        System.out.println(aakash.name);
//        System.out.println(aakash.salary);
//
//        System.out.println(john.id);
//        System.out.println(john.name);
//        System.out.println(john.salary);

//        Alternative Way for printing Attribute using method inside class
        aakash.printDetails();
        aakash.getSalary();
        aakash.personalDetails();

        john.printDetails();
        john.getSalary();
        john.personalDetails();

        vishal.printDetails();
        vishal.getSalary();
        vishal.personalDetails();


    }
}
