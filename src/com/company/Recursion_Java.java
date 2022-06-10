package com.company;
import java.util.*;

public class Recursion_Java {

//    method for calculating factorial
    static int factorial(int x)
    {
        if (x==0 || x==1)
        {
            return 1;
        }
        else
        {
            return x*factorial(x-1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Recursion in Java");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int fac = sc.nextInt();

        int answer = factorial(fac);

        System.out.println("Factorial of, "+ fac +" is: "+ answer);

    }
}
