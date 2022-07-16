package com.company;
import java.util.Scanner;

public class Rough1{
    public static void main(String[] args){
        System.out.println("Arrays in Java");
        Scanner sc = new Scanner(System.in);
        int[] number = new int[6];
        for (int i=0;i<6;i++)
        {
            System.out.println("Enter No."+(i+1)+": ");
            number[i] = sc.nextInt();
            System.out.println(number[i]);
        }


    }
}
