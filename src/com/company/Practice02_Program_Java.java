package com.company;

//Program-01: Program to reverse the Array elements
public class Practice02_Program_Java {
    public static void main(String[] args) {
        System.out.println("Program to reverse the Array elements ");
//        To make an array
        int[] num = {12,15,17,84,45,65,85};
        for (int numb:num)
        {
            System.out.println("Before reversing an array: "+numb);
        }

        for (int i=num.length-1;i>=0;i--)
        {
            System.out.println("After reversing array: "+num[i]);
        }

    }
}
