package com.company;
import java.util.Scanner;

public class If_Else_Condition {
    public static void main(String[] args) {
        System.out.println("if-else condition");
        Scanner sc = new Scanner(System.in);
        Scanner sv = new Scanner(System.in);
        int age;
        int check_sum;
//        boolean bl;

        System.out.println("Enter num1: ");
        int a =sc.nextInt();
        System.out.println("Enter num2: ");
        int b = sc.nextInt();

        if (a>b)
        System.out.printf("%d is greater than %d", a, b);
        else
            System.out.println("False");

        System.out.println("Enter your Age: ");
        age = sc.nextInt();
        if (age>18)
            System.out.println("Eligible for Driving");
        else
            System.out.println("Not Eligible for Driving");

        System.out.println("Enter check_sum: ");
        check_sum=sc.nextInt();

        if (check_sum==29)
        {
            System.out.println("check_sum is correct");
        }
        else
        {
            System.out.println("check_sum is false");
        }

        System.out.println("Enter a String: ");
        String name = sv.nextLine();
//        System.out.println(name.startsWith("A"));
        boolean value = name.startsWith("A");
        System.out.println(value);
        if (value==true)
        {
            System.out.println("Value Matched");
        }
        else
        {
            System.out.println("Value does not match");
        }



    }
}
