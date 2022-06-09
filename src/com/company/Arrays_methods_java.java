package com.company;

public class Arrays_methods_java {
    public static void main(String[] args) {
        System.out.println("Array methods in Java");

        String name = "Aakash";
        System.out.println(name);
        System.out.println(name.length());

//        integer type array
        int[] marks = {96,95,99,52,25,65,89,14,54,77,14,15,85,75,95,99,63,36,25,14};
        System.out.println(marks[3]);
        System.out.println(marks.length);

//        Displaying Array elements - Array Traversal Method
        for (int i=0;i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }

//        String type array
        String[] students = {"Aakash", "Rohan","Rohan","Sohan","Mohan"};
        System.out.println(students[3]);
        System.out.println(students.length);

//        Displaying Array Elements - Using for-each loop
        for (String student : students) {
            System.out.println(student);
        }

//        float type array
        float[] pmarks = {99.5f,79.56f,82.55f,33.6f};
        System.out.println(pmarks[2]);
        System.out.println(pmarks.length);

//        Displaying Array Elements - Using for-each loop
        for (float pmark : pmarks)
        {
            System.out.println(pmark);
        }
    }
}
