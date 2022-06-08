package com.company;
import java.util.Scanner;

public class If_Else_Condition {
    public static void main(String[] args) {
        System.out.println("if-else condition");
        Scanner sc = new Scanner(System.in);
        int age;

        int a =56;
        int b = 96;

        if (a>b)
        System.out.printf("%d is greater than %d", a,b);
        else
            System.out.println("False");

        System.out.println("Enter your Age: ");
        age = sc.nextInt();
        if (age>18)
            System.out.println("Eligible for Driving");
        else
            System.out.println("Not Eligible for Driving");

    }
}
