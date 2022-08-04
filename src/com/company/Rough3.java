package com.company;

class student {
    String sname;
    public void getDetails()
    {
        System.out.println("My name is : "+ sname);
    }
}

public class Rough3 {
    public static void main(String[] args) {

//        Declaring an array of objects for student class
        student[] stu;

//        Allocating memory for 2 objects of student class
        stu = new student[2];

//        Setting the attribute
        stu[0]=new student();
        stu[1]=new student();

        stu[0].sname="Aakash";
        stu[1].sname="John";

        stu[0].getDetails();
        stu[1].getDetails();
    }
}
