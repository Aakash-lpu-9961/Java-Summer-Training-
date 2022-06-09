package com.company;

public class Arrays_Java {
    public static void main(String[] args) {
        System.out.println("Arrays in Java");
//        Classroom of 500 Students - store marks of these 500 students
        /*
        Array is a collection of similar types of data
        Array is modifiable
         */

        int[] marks = new int[5];       // Array Declaration + Memory Allocation
        marks[0] = 100;
        marks[1] = 90;
        marks[2] = 80;
        marks[3] = 70;
        marks[4] = 58;

        int fetch = marks[3];
        System.out.println(fetch);

        int[] marks2 = {20,30,40,50,60,70,80,90,100};   // Another method of Array declaration
        int value = marks2[6];
        System.out.println(value);





    }
}
